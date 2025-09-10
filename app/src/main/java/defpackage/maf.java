package defpackage;

import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import com.google.ar.core.R;
import j$.util.function.Function$CC;
import java.util.Map;
import java.util.function.Function;
import java.util.regex.Pattern;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class maf implements Function {
    private final /* synthetic */ int a;

    public /* synthetic */ maf(int i) {
        this.a = i;
    }

    @Override // java.util.function.Function
    /* renamed from: andThen */
    public final /* synthetic */ Function mo30andThen(Function function) {
        switch (this.a) {
        }
        return Function$CC.$default$andThen(this, function);
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        switch (this.a) {
            case 0:
                int i = mah.f;
                return ((ResolveInfo) obj).activityInfo.packageName;
            case 1:
                int i2 = mah.f;
                return ((mbh) obj).a.activityInfo.packageName;
            case 2:
                return ((mbh) obj).a;
            case 3:
                Pattern pattern = mbc.a;
                return ((ResolveInfo) obj).activityInfo.packageName;
            case 4:
                Pattern pattern2 = mbc.a;
                return ((ResolveInfo) obj).activityInfo.packageName;
            case 5:
                Pattern pattern3 = mbc.a;
                return ((ResolveInfo) obj).activityInfo.packageName;
            case 6:
                return lty.b((oxj) obj);
            case 7:
                return (lty) ((rwc) obj).c();
            case 8:
                return Float.valueOf(((lrf) obj).b);
            case 9:
                return ((mwk) obj).a;
            case 10:
                return (nav) ((Map.Entry) obj).getKey();
            case 11:
                Resources resources = (Resources) obj;
                ndv ndvVarA = ndw.a();
                ndvVarA.s(resources.getDimensionPixelSize(R.dimen.photo_button_inner_radius));
                ndvVarA.q(255);
                ndvVarA.r(-1);
                ndvVarA.n(resources.getColor(R.color.camera_main_button_color, null));
                ndvVarA.D(resources.getColor(R.color.video_mode_idle_color, null));
                ndvVarA.E(0);
                ndvVarA.y(0);
                ndvVarA.e(R.drawable.ic_autotimer_idle);
                ndvVarA.m(resources.getDrawable(R.drawable.ic_autotimer_idle, null).getIntrinsicWidth() / 2);
                ndvVarA.w(resources.getDimensionPixelSize(R.dimen.photo_button_inner_radius));
                ndvVarA.x(resources.getDimensionPixelSize(R.dimen.photo_button_radius));
                ndvVarA.p(resources.getDimensionPixelSize(R.dimen.photo_button_outer_ring_radius));
                return ndvVarA;
            case 12:
                Resources resources2 = (Resources) obj;
                ndv ndvVarA2 = ndw.a();
                ndvVarA2.s(resources2.getDimensionPixelSize(R.dimen.photo_button_inner_radius));
                ndvVarA2.n(resources2.getColor(R.color.camera_main_button_color, null));
                ndvVarA2.q(0);
                ndvVarA2.r(-1);
                ndvVarA2.E(0);
                ndvVarA2.D(0);
                ndvVarA2.y(0);
                ndvVarA2.c(true);
                ndvVarA2.v(255);
                ndvVarA2.w(resources2.getDimensionPixelSize(R.dimen.photo_button_press_radius));
                ndvVarA2.t(resources2.getDimensionPixelSize(R.dimen.photo_button_inner_radius));
                ndvVarA2.u(resources2.getDimensionPixelSize(R.dimen.photo_button_inner_radius));
                ndvVarA2.x(resources2.getDimensionPixelSize(R.dimen.photo_button_radius));
                ndvVarA2.p(resources2.getDimensionPixelSize(R.dimen.photo_button_outer_ring_radius));
                return ndvVarA2;
            case 13:
                Resources resources3 = (Resources) obj;
                ndv ndvVarA3 = ndw.a();
                ndvVarA3.s(resources3.getDimensionPixelSize(R.dimen.photo_button_inner_radius));
                ndvVarA3.n(resources3.getColor(R.color.camera_main_button_color, null));
                ndvVarA3.r(0);
                ndvVarA3.q(0);
                ndvVarA3.E(0);
                ndvVarA3.D(resources3.getColor(R.color.video_mode_idle_color, null));
                ndvVarA3.y(resources3.getDimensionPixelSize(R.dimen.video_button_stop_square_size) / 2);
                ndvVarA3.v(61);
                ndvVarA3.w(resources3.getDimensionPixelSize(R.dimen.photo_button_inner_radius));
                ndvVarA3.x(resources3.getDimensionPixelSize(R.dimen.photo_button_radius));
                ndvVarA3.p(resources3.getDimensionPixelSize(R.dimen.photo_button_outer_ring_radius));
                ndvVarA3.i(61);
                ndvVarA3.e(R.drawable.ic_stop_night);
                ndvVarA3.m(resources3.getDrawable(R.drawable.ic_stop_night, null).getIntrinsicWidth() / 2);
                return ndvVarA3;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                Resources resources4 = (Resources) obj;
                ndv ndvVarA4 = ndw.a();
                ndvVarA4.s(resources4.getDimensionPixelSize(R.dimen.photo_button_press_radius));
                ndvVarA4.q(255);
                ndvVarA4.n(resources4.getColor(R.color.camera_main_button_color, null));
                ndvVarA4.r(resources4.getColor(R.color.camera_mode_idle_color, null));
                ndvVarA4.E(0);
                ndvVarA4.D(0);
                ndvVarA4.y(0);
                ndvVarA4.v(255);
                ndvVarA4.w(resources4.getDimensionPixelSize(R.dimen.photo_button_inner_radius));
                ndvVarA4.t(resources4.getDimensionPixelSize(R.dimen.photo_button_inner_radius));
                ndvVarA4.u(resources4.getDimensionPixelSize(R.dimen.photo_button_inner_radius));
                ndvVarA4.g();
                ndvVarA4.h(-1);
                ndvVarA4.x(resources4.getDimensionPixelSize(R.dimen.photo_button_radius));
                ndvVarA4.p(resources4.getDimensionPixelSize(R.dimen.photo_button_outer_ring_radius));
                ndvVarA4.e(R.drawable.ic_motion_mode);
                ndvVarA4.m(resources4.getDrawable(R.drawable.ic_motion_mode, null).getIntrinsicWidth() / 2);
                return ndvVarA4;
            case 15:
                Resources resources5 = (Resources) obj;
                ndv ndvVarA5 = ndw.a();
                ndvVarA5.s(resources5.getDimensionPixelSize(R.dimen.photo_button_press_radius));
                ndvVarA5.n(resources5.getColor(R.color.camera_main_button_color, null));
                ndvVarA5.q(0);
                ndvVarA5.r(0);
                ndvVarA5.E(0);
                ndvVarA5.D(0);
                ndvVarA5.y(0);
                ndvVarA5.c(true);
                ndvVarA5.v(127);
                ndvVarA5.w(resources5.getDimensionPixelSize(R.dimen.photo_button_radius));
                ndvVarA5.t(0);
                ndvVarA5.u(0);
                ndvVarA5.g();
                ndvVarA5.h(-16777216);
                ndvVarA5.x(resources5.getDimensionPixelSize(R.dimen.photo_button_radius));
                ndvVarA5.p(resources5.getDimensionPixelSize(R.dimen.photo_button_outer_ring_radius));
                ndvVarA5.e(R.drawable.ic_motion_mode);
                ndvVarA5.m(resources5.getDrawable(R.drawable.ic_motion_mode, null).getIntrinsicWidth() / 2);
                return ndvVarA5;
            case 16:
                Resources resources6 = (Resources) obj;
                ndv ndvVarA6 = ndw.a();
                ndvVarA6.s(resources6.getDimensionPixelSize(R.dimen.photo_button_press_radius));
                ndvVarA6.n(resources6.getColor(R.color.camera_main_button_color, null));
                ndvVarA6.q(0);
                ndvVarA6.r(0);
                ndvVarA6.E(0);
                ndvVarA6.D(0);
                ndvVarA6.y(0);
                ndvVarA6.c(true);
                ndvVarA6.v(127);
                ndvVarA6.w(resources6.getDimensionPixelSize(R.dimen.photo_button_press_radius));
                ndvVarA6.t(0);
                ndvVarA6.u(0);
                ndvVarA6.g();
                ndvVarA6.h(-16777216);
                ndvVarA6.x(resources6.getDimensionPixelSize(R.dimen.photo_button_radius));
                ndvVarA6.p(resources6.getDimensionPixelSize(R.dimen.photo_button_outer_ring_radius));
                ndvVarA6.i(61);
                ndvVarA6.e(R.drawable.ic_motion_mode);
                ndvVarA6.m(resources6.getDrawable(R.drawable.ic_motion_mode, null).getIntrinsicWidth() / 2);
                return ndvVarA6;
            case 17:
                Resources resources7 = (Resources) obj;
                ndv ndvVarA7 = ndw.a();
                ndvVarA7.s(resources7.getDimensionPixelSize(R.dimen.photo_button_press_radius));
                ndvVarA7.q(255);
                ndvVarA7.n(resources7.getColor(R.color.camera_main_button_color, null));
                ndvVarA7.r(resources7.getColor(R.color.camera_mode_idle_color, null));
                ndvVarA7.E(0);
                ndvVarA7.D(0);
                ndvVarA7.y(0);
                ndvVarA7.v(255);
                ndvVarA7.w(resources7.getDimensionPixelSize(R.dimen.photo_button_inner_radius));
                ndvVarA7.t(resources7.getDimensionPixelSize(R.dimen.photo_button_inner_radius));
                ndvVarA7.u(resources7.getDimensionPixelSize(R.dimen.photo_button_inner_radius));
                ndvVarA7.g();
                ndvVarA7.h(-1);
                ndvVarA7.x(resources7.getDimensionPixelSize(R.dimen.photo_button_radius));
                ndvVarA7.p(resources7.getDimensionPixelSize(R.dimen.photo_button_outer_ring_radius));
                return ndvVarA7;
            case 18:
                Resources resources8 = (Resources) obj;
                ndv ndvVarA8 = ndw.a();
                ndvVarA8.s(resources8.getDimensionPixelSize(R.dimen.photo_button_press_radius));
                ndvVarA8.n(resources8.getColor(R.color.camera_main_button_color, null));
                ndvVarA8.q(0);
                ndvVarA8.r(0);
                ndvVarA8.E(0);
                ndvVarA8.D(0);
                ndvVarA8.y(0);
                ndvVarA8.c(true);
                ndvVarA8.v(127);
                ndvVarA8.w(resources8.getDimensionPixelSize(R.dimen.photo_button_radius));
                ndvVarA8.t(0);
                ndvVarA8.u(0);
                ndvVarA8.g();
                ndvVarA8.h(-16777216);
                ndvVarA8.x(resources8.getDimensionPixelSize(R.dimen.photo_button_radius));
                ndvVarA8.p(resources8.getDimensionPixelSize(R.dimen.photo_button_outer_ring_radius));
                return ndvVarA8;
            case 19:
                Resources resources9 = (Resources) obj;
                ndv ndvVarA9 = ndw.a();
                ndvVarA9.s(resources9.getDimensionPixelSize(R.dimen.photo_button_press_radius));
                ndvVarA9.q(255);
                ndvVarA9.n(resources9.getColor(R.color.camera_main_button_color, null));
                ndvVarA9.r(resources9.getColor(R.color.camera_mode_idle_color, null));
                ndvVarA9.E(0);
                ndvVarA9.D(0);
                ndvVarA9.y(0);
                ndvVarA9.v(255);
                ndvVarA9.w(resources9.getDimensionPixelSize(R.dimen.photo_button_inner_radius));
                ndvVarA9.t(resources9.getDimensionPixelSize(R.dimen.photo_button_inner_radius));
                ndvVarA9.u(resources9.getDimensionPixelSize(R.dimen.photo_button_inner_radius));
                ndvVarA9.g();
                ndvVarA9.h(-1);
                ndvVarA9.x(resources9.getDimensionPixelSize(R.dimen.photo_button_radius));
                ndvVarA9.p(resources9.getDimensionPixelSize(R.dimen.photo_button_outer_ring_radius));
                ndvVarA9.i(61);
                return ndvVarA9;
            default:
                Resources resources10 = (Resources) obj;
                ndv ndvVarA10 = ndw.a();
                ndvVarA10.s(resources10.getDimensionPixelSize(R.dimen.photo_button_inner_radius));
                ndvVarA10.q(255);
                ndvVarA10.n(resources10.getColor(R.color.camera_main_button_color, null));
                ndvVarA10.r(resources10.getColor(R.color.camera_mode_idle_color, null));
                ndvVarA10.E(0);
                ndvVarA10.D(resources10.getColor(R.color.long_shot_transition_color, null));
                ndvVarA10.y(0);
                ndvVarA10.w(resources10.getDimensionPixelSize(R.dimen.photo_button_inner_radius));
                ndvVarA10.t(resources10.getDimensionPixelSize(R.dimen.photo_button_inner_radius));
                ndvVarA10.u(resources10.getDimensionPixelSize(R.dimen.photo_button_inner_radius));
                ndvVarA10.x(resources10.getDimensionPixelSize(R.dimen.photo_button_radius));
                ndvVarA10.p(resources10.getDimensionPixelSize(R.dimen.photo_button_outer_ring_radius));
                return ndvVarA10;
        }
    }

    public final /* synthetic */ Function compose(Function function) {
        switch (this.a) {
        }
        return Function$CC.$default$compose(this, function);
    }
}
