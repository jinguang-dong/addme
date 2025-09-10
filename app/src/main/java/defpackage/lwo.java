package defpackage;

import android.os.SystemClock;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lwo implements fre {
    public final lwm a;
    public final uem b;
    public final out c;
    public final szh d = new szh();
    private final uem e;
    private final uem f;

    public lwo(lwm lwmVar, uem uemVar, uem uemVar2, uem uemVar3, out outVar) {
        this.a = lwmVar;
        this.b = uemVar;
        this.e = uemVar2;
        this.f = uemVar3;
        this.c = outVar;
    }

    @Override // defpackage.fre
    public final /* synthetic */ int a() {
        return 0;
    }

    @Override // defpackage.fre
    public final syu b() {
        lwm lwmVar = this.a;
        int i = lwmVar.a;
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        }
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 == 2) {
                    d();
                }
            }
            lwmVar.b = this;
            return this.d;
        }
        lwk lwkVar = (lwk) this.e.a();
        if (lwkVar.b()) {
            if (lwkVar.a > ((Long) lwkVar.b.b(luf.aD)).longValue()) {
                lwkVar.c.c(luf.aE);
                lwmVar.b = this;
                lwkVar.a();
                return this.d;
            }
        }
        return ske.M(true);
    }

    @Override // defpackage.fre
    public final /* synthetic */ String c() {
        return gsn.Z(this);
    }

    public final void d() {
        lwl lwlVar = (lwl) this.f.a();
        pql pqlVar = lwlVar.a;
        lwlVar.f = SystemClock.elapsedRealtime();
        this.c.c(new lmw(this, 13));
    }
}
