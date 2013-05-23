package ${groupId}.${rootArtifactId}.service;

import org.junit.Assert;

import ${groupId}.${rootArtifactId}.api.${service};

/**
 * Base class for ${service} testing
 *
 * @author: Generated by the Rio Archetype
 */
public abstract class ITAbstract${service}Test {

    void testService($service service) {
        Assert.assertNotNull(service);
        /* Add your testing code here ...*/
    }
}