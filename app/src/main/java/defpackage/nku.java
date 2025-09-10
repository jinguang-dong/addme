package defpackage;

import com.google.ar.core.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nku {
    public static final sbv a;
    public final int b;
    public final int c;
    public final int d;

    static {
        sbr sbrVar = new sbr();
        sbrVar.f(nkx.UNINITIALIZED, new nku(0, 0, 0));
        sbrVar.f(nkx.PHOTO, new nku(R.string.mode_camera_autobahn, R.drawable.gs_photo_camera_fill1_vd_theme_48, R.string.camera_supermode_res_id));
        sbrVar.f(nkx.VIDEO, new nku(R.string.mode_video, R.drawable.gs_videocam_fill1_vd_theme_48, R.string.video_supermode_res_id));
        a = sbrVar.b();
    }

    public nku(int i, int i2, int i3) {
        this.b = i;
        this.c = i2;
        this.d = i3;
    }
}
