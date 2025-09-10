package defpackage;

import com.google.android.apps.camera.toast.vvJ.CGlJpiVWrCQOq;
import com.google.ar.core.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public enum hqp {
    NONE(nvg.BADGE, R.string.photo_name, R.string.photo_description, R.drawable.quantum_gm_ic_camera_alt_white_24, Integer.valueOf(R.string.filmstrip_processing_text_generic)),
    PANORAMA(nvg.BADGE, R.string.panorama_name, R.string.panorama_description, R.drawable.quantum_gm_ic_vrpano_white_24, Integer.valueOf(R.string.filmstrip_processing_text_panorama)),
    PHOTOSPHERE(nvg.BADGE, R.string.photosphere_name, R.string.photosphere_description, R.drawable.quantum_ic_photosphere_white_24, Integer.valueOf(R.string.filmstrip_processing_text_photosphere)),
    BURSTS(nvg.BADGE, R.string.burst_name, R.string.burst_description, R.drawable.quantum_gm_ic_burst_mode_white_24),
    PORTRAIT(nvg.BADGE, R.string.portrait_name, R.string.portrait_description, R.drawable.quantum_gm_ic_portrait_white_24, Integer.valueOf(R.string.filmstrip_processing_text_portrait)),
    NIGHT(nvg.BADGE, R.string.cuttlefish_name, R.string.cuttlefish_description, R.drawable.ic_cuttlefish, Integer.valueOf(R.string.filmstrip_processing_text_night_sight)),
    MACRO_FOCUS(nvg.BADGE, R.string.macro_focus_name, R.string.macro_focus_description, R.drawable.ic_macro_focus),
    TIMELAPSE(nvg.BADGE, R.string.mode_timelapse, R.string.cheetah_description, R.drawable.quantum_gm_ic_fast_forward_vd_theme_24),
    LANDSCAPE(nvg.BADGE, R.string.motion_blur_landscape, R.string.motion_blur_landscape_description, R.drawable.ic_motion_mode_white, Integer.valueOf(R.string.filmstrip_processing_text_long_exposure)),
    ACTION(nvg.BADGE, R.string.motion_blur_action_pan, R.string.motion_blur_action_pan_description, R.drawable.ic_motion_mode_white, Integer.valueOf(R.string.filmstrip_processing_text_action_pan)),
    CINEMATIC(nvg.BADGE, R.string.cinematic_movements_name, R.string.cinematic_movements_description, R.drawable.quantum_gm_ic_stabilization_pan_vd_theme_24),
    DEBLUR_FUSION(nvg.BADGE, R.string.deblur_fusion, R.string.deblur_fusion_description, R.drawable.ic_face_deblur_24dp),
    SWISS_DOGFOOD(nvg.BADGE, R.string.dogfood_name, R.string.dogfood_description, R.drawable.quantum_gm_ic_dogfood_vd_theme_24),
    AMBER(nvg.BADGE, R.string.amber_name, R.string.amber_description, R.drawable.ic_film_24),
    AMETHYST(nvg.BADGE, R.string.amethyst_name, R.string.amethyst_description, R.drawable.ic_hdr),
    AMETHYST_MATERIAL(nvg.BADGE, R.string.amethyst_name, R.string.amethyst_description, R.drawable.quantum_gm_ic_hdr_on_vd_theme_24),
    HIGH_RESOLUTION(nvg.BADGE, R.string.high_resolution_name, R.string.high_resolution_description, R.drawable.gs_high_res_vd_theme_24, Integer.valueOf(R.string.filmstrip_processing_text_high_res)),
    DOGFOOD_ONLY(nvg.BADGE, R.string.dogfood_name, R.string.dogfood_description, R.drawable.quantum_gm_ic_dogfood_vd_theme_24),
    FONDUE_TOPSHOT(nvg.BADGE, R.string.dogfood_name, R.string.dogfood_description, R.drawable.gs_group_auto_fill1_vd_theme_24, null, false),
    VIDEO_NIGHT_SIGHT(nvg.BADGE, R.string.video_night_sight_name, R.string.video_night_sight_description, R.drawable.ic_cuttlefish),
    COTTAGE(nvg.BADGE, R.string.mode_cottage, R.string.cottage_type_description, R.drawable.gs_group_photo_merge_vd_theme_24);

    private final Integer A;
    private final Boolean B;
    public final nvg v;
    public final int w;
    public final int x;
    public final int y;

    hqp(nvg nvgVar, int i, int i2, int i3) {
        this(nvgVar, i, i2, i3, null, null);
    }

    public static rwc b(String str) {
        if (!rnt.V(str)) {
            try {
                return rwc.i(a(str));
            } catch (IllegalArgumentException unused) {
                String[] strArrSplit = str.split("-");
                if (strArrSplit.length == 2 && strArrSplit[0].equals("com.google.android.apps.camera.gallery.specialtype.SpecialType")) {
                    try {
                        return rwc.i(a(strArrSplit[1]));
                    } catch (IllegalArgumentException | NullPointerException unused2) {
                    }
                }
            }
        }
        return rvk.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x005c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static defpackage.rwc f(defpackage.ltf r1, defpackage.hbj r2) {
        /*
            ltf r0 = defpackage.ltf.UNKNOWN
            int r1 = r1.ordinal()
            r0 = 4
            if (r1 == r0) goto L5f
            r0 = 5
            if (r1 == r0) goto L5c
            r0 = 6
            if (r1 == r0) goto L59
            r0 = 10
            if (r1 == r0) goto L56
            r0 = 16
            if (r1 == r0) goto L53
            r0 = 26
            if (r1 == r0) goto L50
            r0 = 12
            if (r1 == r0) goto L4d
            r0 = 13
            if (r1 == r0) goto L4a
            r0 = 28
            if (r1 == r0) goto L47
            r0 = 29
            if (r1 == r0) goto L5c
            r0 = 0
            switch(r1) {
                case 18: goto L44;
                case 19: goto L41;
                case 20: goto L36;
                case 21: goto L33;
                case 22: goto L30;
                default: goto L2f;
            }
        L2f:
            goto L61
        L30:
            hqp r0 = defpackage.hqp.ACTION
            goto L61
        L33:
            hqp r0 = defpackage.hqp.LANDSCAPE
            goto L61
        L36:
            gzg r1 = defpackage.gzy.p
            boolean r1 = r2.p(r1)
            if (r1 == 0) goto L61
            hqp r0 = defpackage.hqp.MACRO_FOCUS
            goto L61
        L41:
            hqp r0 = defpackage.hqp.AMETHYST
            goto L61
        L44:
            hqp r0 = defpackage.hqp.AMBER
            goto L61
        L47:
            hqp r0 = defpackage.hqp.VIDEO_NIGHT_SIGHT
            goto L61
        L4a:
            hqp r0 = defpackage.hqp.TIMELAPSE
            goto L61
        L4d:
            hqp r0 = defpackage.hqp.NIGHT
            goto L61
        L50:
            hqp r0 = defpackage.hqp.HIGH_RESOLUTION
            goto L61
        L53:
            hqp r0 = defpackage.hqp.CINEMATIC
            goto L61
        L56:
            hqp r0 = defpackage.hqp.PORTRAIT
            goto L61
        L59:
            hqp r0 = defpackage.hqp.PHOTOSPHERE
            goto L61
        L5c:
            hqp r0 = defpackage.hqp.PANORAMA
            goto L61
        L5f:
            hqp r0 = defpackage.hqp.BURSTS
        L61:
            rwc r1 = defpackage.rwc.i(r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hqp.f(ltf, hbj):rwc");
    }

    private static void g(boolean z2, String str) {
        if (!z2) {
            throw new IllegalArgumentException(str);
        }
    }

    private static void h(int i, String str) {
        g(i != 0, str.concat(" must be a valid resource id"));
    }

    public final rwc c() {
        return rwc.i(this.B);
    }

    public final rwc d() {
        return rwc.i(this.A);
    }

    public final String e() {
        return "com.google.android.apps.camera.gallery.specialtype.SpecialType-".concat(String.valueOf(name()));
    }

    hqp(nvg nvgVar, int i, int i2, int i3, Integer num) {
        this(nvgVar, i, i2, i3, num, null);
    }

    hqp(nvg nvgVar, int i, int i2, int i3, Integer num, Boolean bool) {
        this.v = nvgVar;
        this.w = i;
        this.x = i2;
        this.y = i3;
        this.A = num;
        this.B = bool;
        h(i2, "description");
        h(i3, "icon");
        h(i, CGlJpiVWrCQOq.UniMYHMRkmr);
        if (nvgVar.equals(nvg.BADGE)) {
            g(true, "Action activity must be null");
            g(true, "Action description must be null");
            g(true, "Action promotion message must be null");
        } else {
            g(false, "Action activity cannot be null");
            g(false, "Action description cannot be null");
            g(false, "Action promotion message cannot be null");
        }
        if (num != null) {
            h(num.intValue(), "processingText");
        }
    }
}
