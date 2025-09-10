package defpackage;

import android.content.res.Resources;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.util.Pair;
import com.google.ar.core.R;
import j$.util.function.Function$CC;
import java.util.Map;
import java.util.function.Function;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class ndu implements Function {
    private final /* synthetic */ int a;

    public /* synthetic */ ndu(int i) {
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
                Resources resources = (Resources) obj;
                ndv ndvVarA = ndw.a();
                ndvVarA.s(resources.getDimensionPixelSize(R.dimen.photo_button_radius));
                ndvVarA.n(resources.getColor(R.color.camera_main_button_color, null));
                ndvVarA.q(0);
                ndvVarA.r(-1);
                ndvVarA.E(0);
                ndvVarA.D(resources.getColor(R.color.video_mode_idle_color, null));
                ndvVarA.y(resources.getDimensionPixelSize(R.dimen.video_button_stop_square_size) / 2);
                ndvVarA.w(resources.getDimensionPixelSize(R.dimen.photo_button_inner_radius));
                ndvVarA.x(resources.getDimensionPixelSize(R.dimen.photo_button_radius));
                ndvVarA.p(resources.getDimensionPixelSize(R.dimen.photo_button_outer_ring_radius));
                ndvVarA.e(R.drawable.ic_center_rec);
                ndvVarA.m(resources.getDrawable(R.drawable.ic_center_rec, null).getIntrinsicWidth() / 2);
                return ndvVarA;
            case 1:
                Resources resources2 = (Resources) obj;
                ndv ndvVarA2 = ndw.a();
                ndvVarA2.s(resources2.getDimensionPixelSize(R.dimen.photo_button_inner_radius));
                ndvVarA2.q(0);
                ndvVarA2.n(resources2.getColor(R.color.camera_main_button_color, null));
                ndvVarA2.r(resources2.getColor(R.color.camera_mode_idle_color, null));
                ndvVarA2.E(0);
                ndvVarA2.D(resources2.getColor(R.color.video_mode_idle_color, null));
                ndvVarA2.y(0);
                ndvVarA2.w(resources2.getDimensionPixelSize(R.dimen.portrait_button_inner_radius));
                ndvVarA2.t(resources2.getDimensionPixelSize(R.dimen.portrait_button_inner_ring_radius));
                ndvVarA2.u(resources2.getDimensionPixelSize(R.dimen.photo_button_inner_radius));
                ndvVarA2.x(resources2.getDimensionPixelSize(R.dimen.portrait_button_outer_radius));
                ndvVarA2.p(resources2.getDimensionPixelSize(R.dimen.photo_button_outer_ring_radius));
                ndvVarA2.e(R.drawable.ic_brightness_dark_24px);
                ndvVarA2.m(resources2.getDrawable(R.drawable.ic_brightness_dark_24px, null).getIntrinsicWidth() / 2);
                return ndvVarA2;
            case 2:
                Resources resources3 = (Resources) obj;
                ndv ndvVarA3 = ndw.a();
                ndvVarA3.s(resources3.getDimensionPixelSize(R.dimen.photo_button_radius));
                ndvVarA3.n(resources3.getColor(R.color.camera_main_button_color, null));
                ndvVarA3.q(0);
                ndvVarA3.r(-1);
                ndvVarA3.E(0);
                ndvVarA3.i(61);
                ndvVarA3.D(resources3.getColor(R.color.video_mode_idle_color, null));
                ndvVarA3.y(resources3.getDimensionPixelSize(R.dimen.video_button_stop_square_size) / 2);
                ndvVarA3.w(resources3.getDimensionPixelSize(R.dimen.photo_button_inner_radius));
                ndvVarA3.x(resources3.getDimensionPixelSize(R.dimen.photo_button_radius));
                ndvVarA3.p(resources3.getDimensionPixelSize(R.dimen.photo_button_outer_ring_radius));
                ndvVarA3.e(R.drawable.ic_center_rec);
                ndvVarA3.m(resources3.getDrawable(R.drawable.ic_center_rec, null).getIntrinsicWidth() / 2);
                return ndvVarA3;
            case 3:
                Resources resources4 = (Resources) obj;
                ndv ndvVarA4 = ndw.a();
                ndvVarA4.s(resources4.getDimensionPixelSize(R.dimen.photo_button_inner_radius));
                ndvVarA4.n(resources4.getColor(R.color.camera_main_button_color, null));
                ndvVarA4.r(0);
                ndvVarA4.q(0);
                ndvVarA4.E(0);
                ndvVarA4.D(resources4.getColor(R.color.video_mode_idle_color, null));
                ndvVarA4.y(0);
                ndvVarA4.w(resources4.getDimensionPixelSize(R.dimen.photo_button_inner_radius));
                ndvVarA4.x(resources4.getDimensionPixelSize(R.dimen.photo_button_radius));
                ndvVarA4.p(resources4.getDimensionPixelSize(R.dimen.photo_button_outer_ring_radius));
                ndvVarA4.i(61);
                ndvVarA4.e(R.drawable.ic_cancel_night_24px);
                ndvVarA4.m(resources4.getDrawable(R.drawable.ic_cancel_night_24px, null).getIntrinsicWidth() / 2);
                return ndvVarA4;
            case 4:
                Resources resources5 = (Resources) obj;
                ndv ndvVarA5 = ndw.a();
                ndvVarA5.s(resources5.getDimensionPixelSize(R.dimen.photo_button_inner_radius));
                ndvVarA5.n(resources5.getColor(R.color.camera_main_button_color, null));
                ndvVarA5.q(255);
                ndvVarA5.r(resources5.getColor(R.color.camera_mode_idle_color, null));
                ndvVarA5.E(0);
                ndvVarA5.D(resources5.getColor(R.color.video_mode_idle_color, null));
                ndvVarA5.y(0);
                ndvVarA5.w(resources5.getDimensionPixelSize(R.dimen.photo_button_inner_radius));
                ndvVarA5.t(resources5.getDimensionPixelSize(R.dimen.photo_button_inner_radius));
                ndvVarA5.u(resources5.getDimensionPixelSize(R.dimen.photo_button_inner_radius));
                ndvVarA5.x(resources5.getDimensionPixelSize(R.dimen.photo_button_radius));
                ndvVarA5.p(resources5.getDimensionPixelSize(R.dimen.photo_button_outer_ring_radius));
                ndvVarA5.e(R.drawable.ic_brightness_dark_24px);
                ndvVarA5.m(resources5.getDrawable(R.drawable.ic_brightness_dark_24px, null).getIntrinsicWidth() / 2);
                return ndvVarA5;
            case 5:
                return ndw.c((Resources) obj);
            case 6:
                return ndw.d((Resources) obj);
            case 7:
                Resources resources6 = (Resources) obj;
                ndv ndvVarA6 = ndw.a();
                ndvVarA6.s(resources6.getDimensionPixelSize(R.dimen.photo_button_inner_radius));
                ndvVarA6.n(resources6.getColor(R.color.camera_main_button_color, null));
                ndvVarA6.q(255);
                ndvVarA6.r(resources6.getColor(R.color.night_mode_idle_color, null));
                ndvVarA6.E(0);
                ndvVarA6.D(resources6.getColor(R.color.video_mode_idle_color, null));
                ndvVarA6.y(0);
                ndvVarA6.w(resources6.getDimensionPixelSize(R.dimen.photo_button_inner_radius));
                ndvVarA6.t(resources6.getDimensionPixelSize(R.dimen.photo_button_inner_radius));
                ndvVarA6.u(resources6.getDimensionPixelSize(R.dimen.photo_button_inner_radius));
                ndvVarA6.x(resources6.getDimensionPixelSize(R.dimen.photo_button_radius));
                ndvVarA6.p(resources6.getDimensionPixelSize(R.dimen.photo_button_outer_ring_radius));
                ndvVarA6.e(R.drawable.ic_brightness_white_24px);
                ndvVarA6.m(resources6.getDrawable(R.drawable.ic_brightness_white_24px, null).getIntrinsicWidth() / 2);
                return ndvVarA6;
            case 8:
                return ndw.c((Resources) obj);
            case 9:
                Resources resources7 = (Resources) obj;
                ndv ndvVarA7 = ndw.a();
                ndvVarA7.s(resources7.getDimensionPixelSize(R.dimen.photo_button_inner_radius));
                ndvVarA7.n(resources7.getColor(R.color.camera_main_button_color, null));
                ndvVarA7.q(255);
                ndvVarA7.r(ndw.b);
                ndvVarA7.E(0);
                ndvVarA7.D(resources7.getColor(R.color.video_mode_idle_color, null));
                ndvVarA7.y(0);
                ndvVarA7.c(true);
                ndvVarA7.v(61);
                ndvVarA7.w(resources7.getDimensionPixelSize(R.dimen.photo_button_radius));
                ndvVarA7.x(resources7.getDimensionPixelSize(R.dimen.photo_button_radius));
                ndvVarA7.p(resources7.getDimensionPixelSize(R.dimen.photo_button_outer_ring_radius));
                ndvVarA7.e(R.drawable.ic_shutter_astro_pressed);
                ndvVarA7.m(resources7.getDrawable(R.drawable.ic_shutter_astro_pressed, null).getIntrinsicWidth() / 2);
                return ndvVarA7;
            case 10:
                return ((njh) obj).b;
            case 11:
                Pair pair = (Pair) obj;
                return new uen(((Double) pair.first).doubleValue(), ((Double) pair.second).doubleValue());
            case 12:
                uen uenVar = (uen) obj;
                return new uen(uenVar.b, uenVar.a);
            case 13:
                sgv sgvVar = nph.a;
                return new npf((npo) obj);
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                return new piz((CaptureResult) obj);
            case 15:
                return (String) ((Map.Entry) obj).getKey();
            case 16:
                return (pnx) ((Map.Entry) obj).getValue();
            case 17:
                return new pjk((TotalCaptureResult) obj);
            case 18:
                return (poe) ((Map.Entry) obj).getValue();
            case 19:
                return (pva) obj;
            default:
                return qok.d((uys) obj);
        }
    }

    public final /* synthetic */ Function compose(Function function) {
        switch (this.a) {
        }
        return Function$CC.$default$compose(this, function);
    }
}
