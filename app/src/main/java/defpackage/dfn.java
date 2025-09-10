package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dfn implements dfe {
    public final Context a;
    public final String b;
    public final dfb c;
    public final boolean d;
    public final boolean e;
    public final ues f = new uez(new apa(this, 15));
    public boolean g;

    public dfn(Context context, String str, dfb dfbVar, boolean z, boolean z2) {
        this.a = context;
        this.b = str;
        this.c = dfbVar;
        this.d = z;
        this.e = z2;
    }

    public final dfm a() {
        return (dfm) this.f.a();
    }

    @Override // defpackage.dfe
    public final dfa b() {
        return a().b();
    }

    @Override // defpackage.dfe, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f.b()) {
            a().close();
        }
    }
}
