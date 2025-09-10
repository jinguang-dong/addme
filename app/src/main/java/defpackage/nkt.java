package defpackage;

import android.content.res.Resources;
import com.google.ar.core.R;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nkt {
    public static final /* synthetic */ int b = 0;
    private static final Map c;
    public final int a;
    private final int d;
    private final int e;

    static {
        sbr sbrVar = new sbr();
        sbrVar.f(nkw.UNINITIALIZED, new nkt(0, 0, 0));
        sbrVar.f(nkw.PHOTO, new nkt(R.string.mode_camera_autobahn, R.string.mode_camera_autobahn_desc, R.drawable.quantum_gm_ic_camera_alt_vd_theme_24));
        sbrVar.f(nkw.VIDEO, new nkt(R.string.mode_video, R.string.mode_video_desc, R.drawable.quantum_gm_ic_videocam_vd_theme_24));
        sbrVar.f(nkw.AMBER, new nkt(R.string.mode_amber, R.string.mode_amber_desc, R.drawable.ic_film_24));
        sbrVar.f(nkw.IMAX, new nkt(R.string.mode_panorama, R.string.mode_panorama_desc, R.drawable.quantum_gm_ic_vrpano_vd_theme_24));
        sbrVar.f(nkw.SERENGETI, new nkt(R.string.mode_panorama, R.string.mode_panorama_desc, R.drawable.quantum_gm_ic_vrpano_vd_theme_24));
        sbrVar.f(nkw.PHOTO_SPHERE, new nkt(R.string.mode_photosphere, R.string.mode_photosphere_desc, R.drawable.quantum_ic_photosphere_vd_theme_24));
        sbrVar.f(nkw.SLOW_MOTION, new nkt(R.string.mode_video_slomo, R.string.mode_video_slomo_desc, R.drawable.quantum_gm_ic_slow_motion_video_vd_theme_24));
        sbrVar.f(nkw.ACTION_PAN, new nkt(R.string.motion_blur_action_pan, R.string.mode_motion_blur_action_pan_desc, R.drawable.ic_motion_mode_white));
        sbrVar.f(nkw.LANDSCAPE, new nkt(R.string.motion_blur_landscape, R.string.mode_motion_blur_landscape_desc, R.drawable.ic_motion_mode_white));
        sbrVar.f(nkw.PORTRAIT, new nkt(R.string.mode_portrait, R.string.mode_portrait_desc, R.drawable.quantum_gm_ic_portrait_vd_theme_24));
        sbrVar.f(nkw.IMAGE_INTENT, new nkt(R.string.mode_camera, R.string.mode_camera_desc, R.drawable.quantum_gm_ic_camera_alt_vd_theme_24));
        sbrVar.f(nkw.VIDEO_INTENT, new nkt(R.string.mode_video, R.string.mode_video_desc, R.drawable.quantum_gm_ic_videocam_vd_theme_24));
        sbrVar.f(nkw.LENS, new nkt(R.string.mode_lens, R.string.mode_lens_desc, R.drawable.quantum_ic_google_lens_new_vd_theme_24));
        sbrVar.f(nkw.NIGHT_SIGHT, new nkt(R.string.mode_cuttlefish, R.string.mode_cuttlefish_desc, R.drawable.ic_cuttlefish));
        sbrVar.f(nkw.TIME_LAPSE, new nkt(R.string.mode_timelapse, R.string.mode_cheetah_desc, R.drawable.quantum_gm_ic_fast_forward_vd_theme_24));
        sbrVar.f(nkw.SETTINGS, new nkt(R.string.mode_settings, R.string.settings_open_desc, R.drawable.quantum_gm_ic_settings_vd_theme_24));
        sbrVar.f(nkw.ROOSTER, new nkt(R.string.mode_rooster, R.string.mode_rooster_desc, R.drawable.quantum_gm_ic_stabilization_pan_white_24));
        sbrVar.f(nkw.COTTAGE, new nkt(R.string.mode_cottage, R.string.mode_cottage_desc, R.drawable.gs_group_photo_merge_vd_theme_24));
        sbrVar.f(nkw.VIDEO_NIGHT_SIGHT, new nkt(R.string.mode_video_night_sight, R.string.mode_video_night_sight_desc, R.drawable.ic_cuttlefish));
        c = sbrVar.b();
    }

    public nkt(int i, int i2, int i3) {
        this.d = i;
        this.e = i2;
        this.a = i3;
    }

    public static nkt a(nkw nkwVar) {
        nkt nktVar = (nkt) c.get(nkwVar);
        nktVar.getClass();
        return nktVar;
    }

    public final String b(Resources resources) {
        return resources.getString(this.e);
    }

    public final String c(Resources resources) {
        return resources.getString(this.d);
    }
}
