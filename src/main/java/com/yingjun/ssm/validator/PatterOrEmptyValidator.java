package com.yingjun.ssm.validator;

import org.apache.commons.lang3.StringUtils;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.regex.PatternSyntaxException;

/**
 * 
 * @ClassName:PatterOrEmptyValidator.java
 * @Description:验证器
 * @author summer
 * @date 2016年3月31日
 */
public class PatterOrEmptyValidator implements ConstraintValidator<PatternOrEmpty, String> {

	  protected java.util.regex.Pattern pattern;

	    public void initialize(PatternOrEmpty annotation) {
	        final PatternOrEmpty.Flag flags[] = annotation.flags();
	        int intFlag = 0;
	        for (PatternOrEmpty.Flag flag : flags) {
	            intFlag = intFlag | flag.getValue();
	        }

	        try {
	            pattern = java.util.regex.Pattern.compile(annotation.regexp(), intFlag);
	        } catch (PatternSyntaxException e) {
	            throw new IllegalArgumentException("Invalid regular expression.", e);
	        }
	    }


	    public boolean isValid(String value, ConstraintValidatorContext context) {
	        return StringUtils.isEmpty(value) || pattern.matcher(value).matches();
	    }
}
