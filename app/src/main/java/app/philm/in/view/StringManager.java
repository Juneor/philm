package app.philm.in.view;

import android.content.Context;

import app.philm.in.BuildConfig;
import app.philm.in.R;
import app.philm.in.lib.controllers.AboutController;
import app.philm.in.lib.controllers.MainController;
import app.philm.in.lib.controllers.MovieController;
import app.philm.in.lib.model.ListItem;
import app.philm.in.lib.network.NetworkError;
import app.philm.in.lib.util.AppUtils;

public class StringManager {

    public static int getStringResId(MovieController.MovieQueryType movieQueryType) {
        switch (movieQueryType) {
            case POPULAR:
                return R.string.popular_title;
            case TRENDING:
                return R.string.trending_title;
            case LIBRARY:
                return R.string.library_title;
            case WATCHLIST:
                return R.string.watchlist_title;
            case SEARCH:
                return R.string.search_title;
            case UPCOMING:
                return R.string.upcoming_title;
            case RECOMMENDED:
                return R.string.recommended_title;
            case NOW_PLAYING:
                return R.string.in_theatres_title;
            case RELATED:
                return R.string.related_movies;
            case MOVIE_CAST:
                return R.string.cast_movies;
            case MOVIE_CREW:
                return R.string.crew_movies;
        }
        return R.string.app_name;
    }

    public static int getStringResId(MovieController.DiscoverTab tab) {
        switch (tab) {
            case POPULAR:
                return R.string.popular_title;
            case IN_THEATRES:
                return R.string.in_theatres_title;
            case UPCOMING:
                return R.string.upcoming_title;
            case RECOMMENDED:
                return R.string.recommended_title;
        }
        return 0;
    }

    public static int getStringResId(MainController.SideMenuItem item) {
        switch (item) {
            case DISCOVER:
                return R.string.discover_title;
            case TRENDING:
                return R.string.trending_title;
            case LIBRARY:
                return R.string.library_title;
            case WATCHLIST:
                return R.string.watchlist_title;
            case SEARCH:
                return R.string.search_title;
        }
        return R.string.app_name;
    }

    public static int getStringResId(NetworkError error) {
        switch (error) {
            case UNAUTHORIZED_TRAKT:
                return R.string.error_unauthorized;
            case NETWORK_ERROR:
                return R.string.error_network;
            case NOT_FOUND_TRAKT:
                return R.string.error_movie_not_found_trakt;
            case NOT_FOUND_TMDB:
                return R.string.error_movie_not_found_tmdb;
            case UNKNOWN:
            default:
                return R.string.error_unknown;
        }
    }

    public static int getTitleResId(AboutController.AboutItem item) {
        switch (item) {
            case BUILD_VERSION:
                return R.string.about_build_version_title;
            case BUILD_TIME:
                return R.string.about_build_time_title;
            case OPEN_SOURCE:
                return R.string.about_open_source_title;
            case POWERED_BY_TMDB:
                return R.string.about_powered_tmdb_title;
            case POWERED_BY_TRAKT:
                return R.string.about_powered_trakt_title;
        }
        return 0;
    }

    public static String getSubtitle(Context context, AboutController.AboutItem item) {
        switch (item) {
            case BUILD_VERSION:
                return AppUtils.getVersionName();
            case BUILD_TIME:
                return BuildConfig.BUILD_TIME;
            case OPEN_SOURCE:
                return context.getString(R.string.about_open_source_content);
            case POWERED_BY_TMDB:
                return context.getString(R.string.about_powered_tmdb_content);
            case POWERED_BY_TRAKT:
                return context.getString(R.string.about_powered_trakt_content);
        }
        return null;
    }

}
