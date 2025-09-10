package defpackage;

import android.content.Context;
import android.util.Pair;
import com.google.android.gms.common.api.Status;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class onm extends oet {
    public static final /* synthetic */ int a = 0;

    static {
        Pair.create(new ojl(), ojl.Q(null));
    }

    public onm(Context context) {
        super(context, oni.a, oen.a, oes.a);
    }

    public final oor a(String str) {
        ogw ogwVar = new ogw();
        ogwVar.a = new ojb(str, 2);
        return f(ogwVar.a());
    }

    public final oor b(String str) {
        if (odo.d.f(this.b, 12451000) != 0) {
            return ojl.P(new oep(new Status(16)));
        }
        ogw ogwVar = new ogw();
        ogwVar.a = new old(str, 5);
        return f(ogwVar.a());
    }

    public final oor m(String str, String str2) {
        ogw ogwVar = new ogw();
        ogwVar.a = new old(str, str2, 3, null);
        return f(ogwVar.a());
    }
}
