package org.manlier.core.annotation.biz;

import org.springframework.stereotype.Component;

import javax.inject.Inject;
import java.util.Optional;

/**
 * Created by manlier on 2016/10/25.
 */
@Component
public class JsrDependencyTest {

    @Inject
    private Optional<JsrDependency> jsrDependency;

    public Optional<JsrDependency> getJsrDependency() {
        return jsrDependency;
    }
}
