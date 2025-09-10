package defpackage;

import android.content.res.Resources;
import android.database.Cursor;
import com.google.ar.core.R;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class ndt implements Function {
    public final /* synthetic */ boolean a;
    private final /* synthetic */ int b;

    public /* synthetic */ ndt(boolean z, int i) {
        this.b = i;
        this.a = z;
    }

    @Override // java.util.function.Function
    /* renamed from: andThen */
    public final /* synthetic */ Function mo30andThen(Function function) {
        return this.b != 0 ? Function$CC.$default$andThen(this, function) : Function$CC.$default$andThen(this, function);
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        if (this.b != 0) {
            Cursor cursor = (Cursor) obj;
            boolean z = this.a;
            String[] strArr = hcf.c;
            return hcf.a(cursor.getLong(cursor.getColumnIndexOrThrow("_id")), z);
        }
        Resources resources = (Resources) obj;
        ndv ndvVarA = ndw.a();
        ndvVarA.s(resources.getDimensionPixelSize(R.dimen.photo_button_inner_radius));
        ndvVarA.q(0);
        ndvVarA.n(resources.getColor(R.color.camera_main_button_color, null));
        ndvVarA.r(resources.getColor(R.color.camera_mode_idle_color, null));
        ndvVarA.E(0);
        ndvVarA.D(resources.getColor(R.color.video_mode_idle_color, null));
        ndvVarA.y(0);
        ndvVarA.w(resources.getDimensionPixelSize(R.dimen.portrait_button_inner_radius));
        ndvVarA.t(this.a ? resources.getDimensionPixelSize(R.dimen.portrait_wearable_button_inner_ring_radius) : resources.getDimensionPixelSize(R.dimen.portrait_button_inner_ring_radius));
        ndvVarA.u(resources.getDimensionPixelSize(R.dimen.photo_button_inner_radius));
        ndvVarA.x(resources.getDimensionPixelSize(R.dimen.portrait_button_outer_radius));
        ndvVarA.p(resources.getDimensionPixelSize(R.dimen.photo_button_outer_ring_radius));
        return ndvVarA;
    }

    public final /* synthetic */ Function compose(Function function) {
        return this.b != 0 ? Function$CC.$default$compose(this, function) : Function$CC.$default$compose(this, function);
    }
}
