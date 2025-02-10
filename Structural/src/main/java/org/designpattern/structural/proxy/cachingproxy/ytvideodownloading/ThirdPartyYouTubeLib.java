package org.designpattern.structural.proxy.cachingproxy.ytvideodownloading;

import java.util.HashMap;


// The interface of a remote service.

public interface ThirdPartyYouTubeLib
{
	HashMap<String, Video> popularVideos();

	Video getVideo(String videoId);
}