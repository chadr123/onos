package org.onlab.onos.net.intent.impl;

import org.onlab.onos.net.NetworkResource;
import org.onlab.onos.net.intent.IntentId;

import java.util.Collection;

/**
 * Auxiliary service for tracking intent path flows and for notifying the
 * intent service of environment changes via topology change delegate.
 */
public interface ObjectiveTrackerService {

    /**
     * Sets a topology change delegate.
     *
     * @param delegate topology change delegate
     */
    void setDelegate(TopologyChangeDelegate delegate);

    /**
     * Unsets topology change delegate.
     *
     * @param delegate topology change delegate
     */
    void unsetDelegate(TopologyChangeDelegate delegate);

    /**
     * Adds a path flow to be tracked.
     *
     * @param intentId  intent identity on whose behalf the path is being tracked
     * @param resources resources to track
     */
    public void addTrackedResources(IntentId intentId,
                                    Collection<NetworkResource> resources);

    /**
     * Removes a path flow to be tracked.
     *
     * @param intentId  intent identity on whose behalf the path is being tracked
     * @param resources resources to stop tracking
     */
    public void removeTrackedResources(IntentId intentId,
                                       Collection<NetworkResource> resources);

}
