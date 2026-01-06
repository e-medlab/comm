package org.dew.comm.tcpip;

import org.dew.comm.IMessage;

/**
 * This file has been added to the original version found in the repository this one is forked from (check README.md).
 */
public interface TcpIpMessageListener {
    /**
     * Called when a complete ASTM message has been received (up to EOT).
     *
     * @param incoming The parsed ASTM IMessage from the remote peer.
     * @return Optional response to send back on the same socket. Return null
     *         if no ASTM response should be sent.
     * @throws Exception if something goes wrong in your handler.
     */
    IMessage onMessage(IMessage incoming) throws Exception;
}
