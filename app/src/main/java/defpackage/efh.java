package defpackage;

import android.graphics.Rect;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class efh {
    public Map a;
    public Map b;
    public Map c;
    public aab d;
    public zb e;
    public List f;
    public Rect g;
    public float h;
    public float i;
    public float j;
    public final coh l = new coh(null);
    private final HashSet m = new HashSet();
    public int k = 0;

    public final float a() {
        return (long) ((b() / this.j) * 1000.0f);
    }

    public final float b() {
        return this.i - this.h;
    }

    public final ejk c(long j) {
        return (ejk) this.e.d(j);
    }

    public final void d(String str) {
        elg.a(str);
        this.m.add(str);
    }

    public final void e(int i) {
        this.k += i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LottieComposition:\n");
        Iterator it = this.f.iterator();
        while (it.hasNext()) {
            sb.append(((ejk) it.next()).a("\t"));
        }
        return sb.toString();
    }
}
