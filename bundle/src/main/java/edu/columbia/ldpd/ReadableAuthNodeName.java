package edu.columbia.ldpd;

import org.apache.felix.scr.annotations.Component;
import org.apache.felix.scr.annotations.Service;
import org.apache.jackrabbit.oak.spi.security.user.AuthorizableNodeName;
 
@Component
@Service(AuthorizableNodeName.class)
public class ReadableAuthNodeName implements AuthorizableNodeName {
	public String generateNodeName(String authorizableId) {
		return authorizableId;
	}
}