package defpackage;

import android.util.Range;
import android.widget.TextView;
import j$.util.Optional;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class iru {
    private final Range a;
    private final Range b;
    private final Range c;
    private final isc d;
    private List e = new ArrayList();
    private Optional f = Optional.empty();
    private Optional g = Optional.empty();
    private int h = 0;
    private boolean i = false;

    public iru(isc iscVar) {
        this.d = iscVar;
        gzg gzgVar = gza.a;
        Range range = new Range(Float.valueOf(0.0f), Float.valueOf(0.199f));
        this.a = range;
        iscVar.b = range;
        TextView textView = iscVar.e;
        Range range2 = new Range(Float.valueOf(0.2f), Float.valueOf(0.499f));
        this.b = range2;
        iscVar.c = range2;
        TextView textView2 = iscVar.f;
        Range range3 = new Range(Float.valueOf(0.5f), Float.valueOf(1.0f));
        this.c = range3;
        iscVar.d = range3;
        TextView textView3 = iscVar.g;
    }

    private final synchronized float e() {
        if (this.e.isEmpty()) {
            return 0.0f;
        }
        return ((Float) Collections.max(this.e)).floatValue();
    }

    private final synchronized iqp f(float f) {
        Range range = this.a;
        Float fValueOf = Float.valueOf(f);
        if (!range.contains((Range) fValueOf)) {
            if (this.b.contains((Range) fValueOf)) {
                return iqp.HINT;
            }
            if (this.c.contains((Range) fValueOf)) {
                return iqp.SURPRISE;
            }
        }
        return iqp.IDLE;
    }

    private final synchronized void g(float f) {
        if (!this.f.isEmpty()) {
            Optional optionalOf = Optional.of(f(f));
            this.g = optionalOf;
            if (h((iqp) optionalOf.get())) {
                this.g = Optional.of(iqp.IDLE);
            }
        }
    }

    private final synchronized boolean h(iqp iqpVar) {
        if (!this.f.isEmpty()) {
            if (iqpVar.equals(iqp.HINT)) {
                if (((iqp) this.f.get()).equals(iqp.IDLE)) {
                    if (!this.i) {
                        int i = this.h;
                        if (i < 3) {
                            this.h = i + 1;
                            return true;
                        }
                        this.i = true;
                        return false;
                    }
                }
            }
            this.h = 0;
            this.i = false;
            return false;
        }
        return false;
    }

    public final synchronized iqp a() {
        return (iqp) this.g.orElse(iqp.IDLE);
    }

    public final synchronized void b(List list) {
        this.e = list;
        float fE = e();
        this.d.a.a(Float.valueOf(fE));
        g(fE);
    }

    public final synchronized void c(iqp iqpVar) {
        this.f = Optional.of(iqpVar);
    }

    public final synchronized void d() {
        e();
    }
}
