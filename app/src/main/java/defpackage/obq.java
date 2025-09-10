package defpackage;

import android.content.SharedPreferences;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class obq extends oao {
    public SharedPreferences a;
    public long c;
    public final obp d;
    private long e;

    protected obq(oar oarVar) {
        super(oarVar);
        this.e = -1L;
        this.d = new obp(this, ((Long) obh.A.f()).longValue());
    }

    @Override // defpackage.oao
    protected final void a() {
        this.a = d().getSharedPreferences("com.google.android.gms.analytics.prefs", 0);
    }

    public final long b() {
        oak.a();
        z();
        long j = this.e;
        if (j != -1) {
            return j;
        }
        long j2 = this.a.getLong("last_dispatch", 0L);
        this.e = j2;
        return j2;
    }

    public final void c() {
        oak.a();
        z();
        long jCurrentTimeMillis = System.currentTimeMillis();
        SharedPreferences.Editor editorEdit = this.a.edit();
        editorEdit.putLong("last_dispatch", jCurrentTimeMillis);
        editorEdit.apply();
        this.e = jCurrentTimeMillis;
    }
}
