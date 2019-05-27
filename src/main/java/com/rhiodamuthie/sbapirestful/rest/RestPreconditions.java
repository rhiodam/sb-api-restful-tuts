package com.rhiodamuthie.sbapirestful.rest;

import com.rhiodamuthie.sbapirestful.exception.MyResourceNotFoundException;

public class RestPreconditions {
    public static <T> T checkFound(T resource) throws MyResourceNotFoundException {
        if (resource == null) {
            throw new MyResourceNotFoundException();
        }
        return resource;
    }

    public static void checkNotNull(Object byId) {
    }
}
