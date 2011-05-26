package com.paypal.nexus.reversedep.view;

import java.util.ArrayList;
import java.util.List;

import org.codehaus.plexus.component.annotations.Component;
import org.sonatype.nexus.plugins.rest.AbstractNexusResourceBundle;
import org.sonatype.nexus.plugins.rest.DefaultStaticResource;
import org.sonatype.nexus.plugins.rest.NexusResourceBundle;
import org.sonatype.nexus.plugins.rest.StaticResource;

/**
 * This class maps the URL reference to static resources to the physical
 * location of the corresponding resource.
 * 
 * @author Saleem Shafi
 */
@Component(role = NexusResourceBundle.class, hint = "pluginConsole")
public class ReverseDependencyResourceBundle extends
		AbstractNexusResourceBundle {
	@Override
	public List<StaticResource> getContributedResouces() {
		List<StaticResource> result = new ArrayList<StaticResource>();

		DefaultStaticResource resource = new DefaultStaticResource(
				getClass()
						.getResource(
								"/static/js/nexus-plugin-reverse-dependency-plugin-all.js"),
				"/js/repoServer/nexus-plugin-reverse-dependency-plugin-all.js",
				"application/x-javascript");
		result.add(resource);

		return result;
	}
}