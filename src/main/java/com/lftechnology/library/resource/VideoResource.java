
package com.lftechnology.library.resource;

import java.util.List;

import javax.inject.Inject;
import javax.validation.Valid;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.apache.logging.log4j.Logger;

import com.lftechnology.library.dao.VideoDAO;
import com.lftechnology.library.model.Video;

@Path("video")
public class VideoResource {

    @Inject
    private VideoDAO videoDAO;

    @Inject
    private Logger logger;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Video> getAll() {
        logger.debug("Inside VideoResource#getAll method.");
        return this.videoDAO.findAll();
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/{id}")
    public Video get(@PathParam("id") String videoId) {
        logger.debug("Inside VideoResource#get method. Video id is: {}", videoId);
        Long id = Long.parseLong(videoId);
        return this.videoDAO.findById(id);
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Video save(@Valid Video video) {
        logger.debug("Inside VideoResource#save method. Video to be saved is: {}", video);
        video.setCreatedBy(1L);
        video.setLastModifiedBy(1L);
        return this.videoDAO.save(video);
    }
}
