package org.manlier.core.ioc.beannature;

/**
 * Created by manlier on 2016/10/19.
 */
public class DefaultBlogService {

    private BlogDao blogDao;

    public void setBlogDao(BlogDao blogDao) {
        this.blogDao = blogDao;
    }

    // this is (unsupprisingly) the initialization callback method
    public void init() {
        if(blogDao == null)
            throw new IllegalStateException("The [blogDao] property must be set.");
    }
}
