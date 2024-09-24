package functional.programming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Video video = new Video("GOT1", "got1.com", VideoType.CLIP);
        Video video1 = new Video("GOT2", "got2.com",VideoType.EPISODE);
        Video video2 = new Video("GOT3", "got3.com", VideoType.PREVIEW);
        Video video3 = new Video("GOT4", "got4.com", VideoType.PREVIEW);
        Video video4 = new Video("GOT5", "got5.com", VideoType.CLIP);
        Video video5 = new Video("GOT6", "got6.com", VideoType.EPISODE);

        Episode episode = new Episode("got1", 1, Arrays.asList(video, video1));
        Episode episode1 = new Episode("got2", 2, Arrays.asList(video2, video3));
        Episode episode2 = new Episode("got3", 1, Arrays.asList(video4, video5));

        Season season = new Season("GOTS1", 1, Arrays.asList(episode, episode1));
        Season season1 = new Season("GOTS1", 2, Arrays.asList(episode2));
        List<Season> seasons = Arrays.asList(season, season1);

        // List of all episodes
        List<Episode> episodes = seasons.stream()
                .flatMap(s -> season.episodes.stream())
                .collect(Collectors.toList());

        // List of all videos
        List<Video> videos = seasons.stream()
                .flatMap(s -> season.episodes.stream())
                .flatMap(e -> e.videos.stream())
                .collect(Collectors.toList());

        // List of season names
        List<Integer> seasonName = seasons.stream()
                .map( s-> s.seasonNumber)
                .collect(Collectors.toList());

        // List of season number
        List<Integer> seasonNumbers = seasons.stream()
                .map( s-> s.seasonNumber)
                .collect(Collectors.toList());

        //List of all episodes name
        List<String> episodeNames = seasons.stream()
                .flatMap(s-> season.episodes.stream())
                .map(e-> e.episodeName)
                .collect(Collectors.toList());

        // List of all episodes number
        List<Integer> episodeNumbers = seasons.stream()
                .flatMap( s-> season.episodes.stream())
                .map(e-> e.episodeNumber)
                .collect(Collectors.toList());

        // List of all video names
        List<String> videoNames = seasons.stream()
                .flatMap(s-> season.episodes.stream())
                .flatMap( e-> videos.stream())
                .map(v -> v.title)
                .collect(Collectors.toList());

        // List of videos url
        List<String> videosUrl = seasons.stream()
                .flatMap(s-> season.episodes.stream())
                .flatMap(e-> videos.stream())
                .map(v-> v.url)
                .collect(Collectors.toList());

        //List of even episodes
        List<Episode> evenEpisodes = seasons.stream()
                .flatMap(s-> season.episodes.stream())
                .filter(e-> e.episodeNumber % 2 == 0)
                .collect(Collectors.toList());

        // List of even seasons
        List<Season> evenSeasons = seasons.stream()
                .filter(s-> season.seasonNumber % 2 == 0)
                .collect(Collectors.toList());

        //List of even episodes and seasons
        List<Episode> evenEpisodesFromEvenSeasons = seasons.stream()
                .filter(s-> season.seasonNumber % 2 == 0)
                .flatMap(s-> season.episodes.stream())
                .filter(v-> v.episodeNumber % 2 == 0)
                .collect(Collectors.toList());

        //List of clips videos from even episodes and odd seasons
        List<Video> clipVideoFromEvenEpisodesFromOddSeasons = seasons.stream()
                .filter(s-> season.seasonNumber % 2 == 0)
                .flatMap(s-> season.episodes.stream())
                .filter(e-> e.episodeNumber % 2 != 0)
                .flatMap(e->e.videos.stream())
                .filter(v-> video.videoType == VideoType.CLIP)
                .collect(Collectors.toList());

        //list of preview videos from odd episodes and even seasons
        List<Video> previewVideoFromOddEpisodesFromEvenSeasons = seasons.stream()
                .filter(s-> season.seasonNumber % 2 != 0)
                .flatMap(s-> season.episodes.stream())
                .filter(e-> e.episodeNumber % 2 == 0)
                .flatMap(e->e.videos.stream())
                .filter(v-> video.videoType == VideoType.PREVIEW)
                .collect(Collectors.toList());

                System.out.println("updated");






    }
}
