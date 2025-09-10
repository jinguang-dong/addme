package defpackage;

import java.util.ConcurrentModificationException;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ugo {
    public final ugq a;
    public int b;
    public int c = -1;
    private int d;

    public ugo(ugq ugqVar) {
        this.a = ugqVar;
        this.d = ugqVar.f;
        b();
    }

    public final void a() {
        if (this.a.f != this.d) {
            throw new ConcurrentModificationException();
        }
    }

    public final void b() {
        while (true) {
            int i = this.b;
            ugq ugqVar = this.a;
            if (i >= ugqVar.e || ugqVar.d[i] >= 0) {
                return;
            } else {
                this.b = i + 1;
            }
        }
    }

    public final boolean hasNext() {
        return this.b < this.a.e;
    }

    public final void remove() {
        a();
        if (this.c == -1) {
            throw new IllegalStateException("Call next() before removing element from the iterator.");
        }
        ugq ugqVar = this.a;
        ugqVar.f();
        ugqVar.g(this.c);
        this.c = -1;
        this.d = ugqVar.f;
    }
}
