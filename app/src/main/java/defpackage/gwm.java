package defpackage;

import android.content.res.Resources;
import com.google.ar.core.R;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gwm implements pau {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public gwm(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r3v11, types: [java.lang.Object, let] */
    /* JADX WARN: Type inference failed for: r4v12, types: [java.lang.Object, utj] */
    @Override // defpackage.pau
    public final /* synthetic */ void a(Object obj) throws Resources.NotFoundException {
        int i = this.b;
        int iIntValue = 0;
        if (i == 0) {
            gwv gwvVar = (gwv) this.a;
            Integer num = gwvVar.w;
            Object obj2 = ((List) obj).get(1);
            obj2.getClass();
            if (((Boolean) obj2).booleanValue() && num != null) {
                iIntValue = num.intValue() - gwvVar.o.getDimensionPixelSize(R.dimen.zoom_large_screen_control_panel_offset);
            }
            gwvVar.P.h(iIntValue);
            return;
        }
        if (i == 1) {
            if (((ltu) obj).equals(ltu.UNSPECIFIED)) {
                ((gmc) this.a).a.a.a(ltu.PHONE);
                return;
            }
            return;
        }
        if (i == 2) {
            gwv gwvVar2 = (gwv) this.a;
            gyd gydVar = (gyd) gwvVar2.X.d.c();
            if (gydVar != null) {
                gwvVar2.b.f(gydVar);
                return;
            }
            return;
        }
        if (i != 3) {
            ((krj) ((ksj) this.a).b.get()).m(false, ksj.a);
            return;
        }
        ?? r3 = this.a;
        Integer num2 = (Integer) obj;
        les lesVarA = r3.a();
        try {
            r3.n(num2.intValue());
        } finally {
            lesVarA.a();
        }
    }
}
