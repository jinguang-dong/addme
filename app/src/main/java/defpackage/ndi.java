package defpackage;

import android.content.Context;
import android.content.res.Resources;
import com.google.ar.core.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ndi {
    public static final ndi a = new ndi();
    public static final ndx b;
    public static final ndx c;
    public static final ndx d;
    public static final ndx e;
    public static final ndx f;
    public static final ndx g;
    public static final ndx h;
    public static final ndx i;
    public static final ndx j;
    public static final ndx k;
    public static final ndx l;
    public static final ndx m;
    public static final ndx n;

    static {
        Integer num = null;
        b = new ndx(R.drawable.vd_portrait, Integer.valueOf(R.drawable.avd_portrait_in), Integer.valueOf(R.drawable.avd_portrait_out), null, num, 24);
        Integer num2 = null;
        c = new ndx(R.drawable.vd_nightsight, Integer.valueOf(R.drawable.avd_nightsight_in), Integer.valueOf(R.drawable.avd_nightsight_out), num, num2, 24);
        Integer num3 = null;
        d = new ndx(R.drawable.vd_astro, Integer.valueOf(R.drawable.avd_astro_in), Integer.valueOf(R.drawable.avd_astro_out), num2, num3, 24);
        Integer num4 = null;
        e = new ndx(R.drawable.vd_motion, Integer.valueOf(R.drawable.avd_motion_in), Integer.valueOf(R.drawable.avd_motion_out), num3, num4, 24);
        Integer num5 = null;
        f = new ndx(R.drawable.vd_actionpan, Integer.valueOf(R.drawable.avd_actionpan_in), Integer.valueOf(R.drawable.avd_actionpan_out), num4, num5, 24);
        Integer num6 = null;
        g = new ndx(R.drawable.vd_panorama, Integer.valueOf(R.drawable.avd_panorama_in), Integer.valueOf(R.drawable.avd_panorama_out), num5, num6, 24);
        h = new ndx(R.drawable.vd_addme, Integer.valueOf(R.drawable.avd_addme_in), Integer.valueOf(R.drawable.avd_addme_out), num6, null, 24);
        Integer num7 = null;
        i = new ndx(R.drawable.vd_timelapse, Integer.valueOf(R.drawable.avd_timelapse_in), Integer.valueOf(R.drawable.avd_timelapse_out), null, num7, 24);
        Integer num8 = null;
        j = new ndx(R.drawable.vd_slowmotion, Integer.valueOf(R.drawable.avd_slowmotion_in), Integer.valueOf(R.drawable.avd_slowmotion_out), num7, num8, 24);
        Integer num9 = null;
        k = new ndx(R.drawable.vd_blur, Integer.valueOf(R.drawable.avd_blur_in), Integer.valueOf(R.drawable.avd_blur_out), num8, num9, 24);
        Integer num10 = null;
        l = new ndx(R.drawable.vd_pan, Integer.valueOf(R.drawable.avd_pan_in), Integer.valueOf(R.drawable.avd_pan_out), num9, num10, 24);
        int i2 = -1;
        m = new ndx(R.drawable.vd_cancel, Integer.valueOf(R.drawable.avd_cancel_in), Integer.valueOf(R.drawable.avd_cancel_out), num10, i2, 8);
        n = new ndx(R.drawable.gs_check_fill1rond100_vd_theme_24, null, num6, Integer.valueOf(R.dimen.freeway_static_icon_half_size), i2, 6);
    }

    private ndi() {
    }

    public static final int h(Context context) {
        return context.getColor(R.color.freeway_shutter_background_on_viewfinder);
    }

    public static final int i(Context context) {
        return context.getColor(R.color.freeway_shutter_background_on_black);
    }

    public static final int j(Context context) {
        return context.getColor(R.color.freeway_recording_red);
    }

    public static final ndv n(Context context, ndx ndxVar) {
        ndv ndvVarR = r(context, ndxVar);
        ndvVarR.r(-16777216);
        ndvVarR.q(102);
        ndvVarR.f(-1);
        return ndvVarR;
    }

    public static final ndv o(Context context, ndx ndxVar) {
        Resources resources = context.getResources();
        ndv ndvVarR = r(context, ndxVar);
        ndvVarR.s(resources.getDimensionPixelSize(R.dimen.freeway_photo_button_idle_inner_radius));
        ndvVarR.q(255);
        ndvVarR.r(-1);
        return ndvVarR;
    }

    public static final ndv p(Context context, int i2, int i3) throws Resources.NotFoundException {
        Resources resources = context.getResources();
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.freeway_video_stop_square_half_size);
        int dimensionPixelSize2 = dimensionPixelSize - resources.getDimensionPixelSize(R.dimen.freeway_video_stop_square_corner_radius);
        ndv ndvVarR = r(context, null);
        ndvVarR.j(dimensionPixelSize2);
        ndvVarR.r(i2);
        ndvVarR.q(255);
        ndvVarR.s(dimensionPixelSize);
        ndvVarR.n(i3);
        return ndvVarR;
    }

    public static final ndv q(Context context, ndx ndxVar) {
        Resources resources = context.getResources();
        ndv ndvVarR = r(context, ndxVar);
        ndvVarR.s(resources.getDimensionPixelSize(R.dimen.freeway_video_button_idle_inner_radius));
        ndvVarR.q(255);
        ndvVarR.r(-1);
        ndvVarR.n(h(context));
        return ndvVarR;
    }

    private static final ndv r(Context context, ndx ndxVar) {
        Integer num;
        Resources resources = context.getResources();
        ndv ndvVarA = ndw.a();
        ndvVarA.s(0);
        ndvVarA.q(0);
        ndvVarA.r(-1);
        ndvVarA.n(i(context));
        ndvVarA.x(resources.getDimensionPixelSize(R.dimen.freeway_shutter_button_radius));
        ndvVarA.p(resources.getDimensionPixelSize(R.dimen.freeway_shutter_button_radius));
        ndvVarA.i(0);
        ndvVarA.w(0);
        ndvVarA.y(0);
        ndvVarA.E(0);
        ndvVarA.D(0);
        int iIntValue = R.dimen.freeway_animated_icon_half_size;
        if (ndxVar != null && (num = ndxVar.d) != null) {
            iIntValue = num.intValue();
        }
        ndvVarA.m(resources.getDimensionPixelSize(iIntValue));
        if (ndxVar == null) {
            return ndvVarA;
        }
        ndvVarA.f(qpt.Q(context, R.attr.colorSecondaryContainer, -16777216));
        ndvVarA.e(ndxVar.a);
        Integer num2 = ndxVar.b;
        Integer num3 = ndxVar.e;
        ndvVarA.b = ndx.a(context, num2, num3);
        ndvVarA.c = ndx.a(context, ndxVar.c, num3);
        return ndvVarA;
    }

    public final ndv a(Context context, ndx ndxVar) {
        ndv ndvVarO = o(context, ndxVar);
        ndvVarO.q(204);
        ndvVarO.s(context.getResources().getDimensionPixelSize(R.dimen.freeway_photo_button_pressed_inner_radius));
        return ndvVarO;
    }

    public final ndv b(Context context, ndx ndxVar) {
        ndv ndvVarO = o(context, ndxVar);
        ndvVarO.q(0);
        ndvVarO.f(-1);
        return ndvVarO;
    }

    public final ndv c(Context context) {
        return p(context, -1, i(context));
    }

    public final ndv d(Context context, ndx ndxVar) {
        ndv ndvVarO = o(context, ndxVar);
        ndvVarO.n(h(context));
        return ndvVarO;
    }

    public final ndv e(Context context) {
        return p(context, -1, h(context));
    }

    public final ndv f(Context context, ndx ndxVar) {
        ndv ndvVarQ = q(context, ndxVar);
        ndvVarQ.r(j(context));
        return ndvVarQ;
    }

    public final ndv g(Context context) {
        return p(context, j(context), h(context));
    }
}
