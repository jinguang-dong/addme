package defpackage;

import com.google.android.apps.camera.ui.hotshot.yElM.PNlJufQ;
import java.util.Comparator;
import java.util.Map;
import java.util.Random;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tab {
    private static final seo f;
    public final tad a;
    public long b;
    public Object c;
    public Object d;
    public rtl e;

    static {
        tow towVarB = tow.b();
        towVarB.d(ttg.a);
        new tow(towVarB);
        f = seo.e(Double.valueOf(0.0d), Double.valueOf(1.0d));
    }

    public tab(Comparator comparator) {
        this.a = new tad(new Random(), comparator);
    }

    public final Object a(double d) {
        rnt.M(this.b > 0, PNlJufQ.ADeFaDNG);
        seo seoVar = f;
        Double dValueOf = Double.valueOf(d);
        rnt.F(seoVar.a(dValueOf), "Parameter phi must be in [0, 1], got %s: ", dValueOf);
        if (d == 0.0d) {
            rnt.M(this.c != null, "Invalid state, min is not initialized");
            return this.c;
        }
        if (d == 1.0d) {
            rnt.M(this.d != null, "Invalid state, max is not initialized");
            return this.d;
        }
        if (this.e == null) {
            this.e = new rtl(this.a);
        }
        rtl rtlVar = this.e;
        if (d < 0.0d || d > 1.0d) {
            throw new IllegalArgumentException("Parameter phi must be in [0, 1].");
        }
        scs scsVar = (scs) rtlVar.a;
        Map.Entry entryCeilingEntry = scsVar.ceilingEntry(dValueOf);
        return entryCeilingEntry == null ? scsVar.lastEntry().getValue() : entryCeilingEntry.getValue();
    }
}
