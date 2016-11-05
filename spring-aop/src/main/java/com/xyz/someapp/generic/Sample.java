package com.xyz.someapp.generic;

import java.util.Collection;

/**
 * Created by manlier on 2016/11/2.
 */
public interface Sample<T> {
    void sampleGenericMethod(T param);
    void sampleGenericCollectionMethod(Collection<T> param);
}
