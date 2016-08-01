package com.yingjun.ssm.validator;

import javax.validation.Constraint;
import javax.validation.Payload;
import javax.validation.constraints.Pattern;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * 
 * @ClassName:PatternOrEmpty.java
 * @Description:为空或者正则注解
 * @author summer
 * @date 2016年3月31日
 */
@Target({ METHOD, FIELD, ANNOTATION_TYPE })
@Retention(RUNTIME)
@Constraint(validatedBy = PatterOrEmptyValidator.class)
@Documented
public @interface PatternOrEmpty {
	/**
	 * @return the regular expression to match
	 */
	String regexp();

	/**
	 * @return array of {@code Flag}s considered when resolving the regular expression
	 */
	Flag[] flags() default { };

	/**
	 * @return the error message template
	 */
	String message() default "{com.gongfutrip.validator.PatternOrEmpty.message}";

	/**
	 * @return the groups the constraint belongs to
	 */
	Class<?>[] groups() default { };

	/**
	 * @return the payload associated to the constraint
	 */
	Class<? extends Payload>[] payload() default { };

	/**
	 * Possible Regexp flags.
	 */
	public static enum Flag {

		/**
		 * Enables Unix lines mode.
		 *
		 * @see java.util.regex.Pattern#UNIX_LINES
		 */
		UNIX_LINES( java.util.regex.Pattern.UNIX_LINES ),

		/**
		 * Enables case-insensitive matching.
		 *
		 * @see java.util.regex.Pattern#CASE_INSENSITIVE
		 */
		CASE_INSENSITIVE( java.util.regex.Pattern.CASE_INSENSITIVE ),

		/**
		 * Permits whitespace and comments in pattern.
		 *
		 * @see java.util.regex.Pattern#COMMENTS
		 */
		COMMENTS( java.util.regex.Pattern.COMMENTS ),

		/**
		 * Enables multiline mode.
		 *
		 * @see java.util.regex.Pattern#MULTILINE
		 */
		MULTILINE( java.util.regex.Pattern.MULTILINE ),

		/**
		 * Enables dotall mode.
		 *
		 * @see java.util.regex.Pattern#DOTALL
		 */
		DOTALL( java.util.regex.Pattern.DOTALL ),

		/**
		 * Enables Unicode-aware case folding.
		 *
		 * @see java.util.regex.Pattern#UNICODE_CASE
		 */
		UNICODE_CASE( java.util.regex.Pattern.UNICODE_CASE ),

		/**
		 * Enables canonical equivalence.
		 *
		 * @see java.util.regex.Pattern#CANON_EQ
		 */
		CANON_EQ( java.util.regex.Pattern.CANON_EQ );

		//JDK flag value
		private final int value;

		private Flag(int value) {
			this.value = value;
		}

		/**
		 * @return flag value as defined in {@link java.util.regex.Pattern}
		 */
		public int getValue() {
			return value;
		}
	}

	/**
	 * Defines several {@link Pattern} annotations on the same element.
	 *
	 * @see Pattern
	 */
	@Target({ METHOD, FIELD, ANNOTATION_TYPE, CONSTRUCTOR, PARAMETER })
	@Retention(RUNTIME)
	@Documented
	@interface List {

		Pattern[] value();
	}
}
