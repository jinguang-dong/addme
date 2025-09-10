package defpackage;

import android.media.MediaFormat;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class oyl implements Comparable {
    private final int f;
    public boolean a = false;
    public volatile boolean b = false;
    private int e = -1;
    public boolean c = true;
    public MediaFormat d = null;

    public oyl(int i) {
        this.f = i;
    }

    public final int a() {
        if (this.a) {
            return this.e;
        }
        throw new IllegalStateException("Track is not yet added");
    }

    public final void b() {
        this.c = false;
    }

    public final void c(int i) {
        if (this.f == 3) {
            throw new IllegalStateException("This track is forbidden.");
        }
        this.e = i;
        this.a = true;
        this.b = false;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return a() - ((oyl) obj).a();
    }

    public final boolean d() {
        return this.f == 3;
    }

    public final boolean e() {
        int i = this.f - 1;
        return i != 0 ? i != 1 || this.b || this.a : this.a;
    }
}
