package com.talgat.store.api.annotation;

import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.lang.annotation.*;

@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
@RequestMapping({"api/protected"})
@Secured("ROLE_ADMIN")
public @interface ProtectedApiAnnotation {
}
