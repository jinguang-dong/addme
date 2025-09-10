package defpackage;

import kotlinx.coroutines.CoroutineExceptionHandler;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bat implements und, baq {
    public static final uhf a = new axv();
    public final uhf b;
    public final uhf c;
    private final Object d = this;
    private volatile uhf e;

    public bat(uhf uhfVar, uhf uhfVar2) {
        this.b = uhfVar;
        this.c = uhfVar2;
    }

    @Override // defpackage.baq
    public final void a() {
        d();
    }

    @Override // defpackage.baq
    public final void b() {
        d();
    }

    @Override // defpackage.und
    public final uhf c() {
        uhf uhfVarPlus = this.e;
        if (uhfVarPlus == null || uhfVarPlus == a) {
            uhf uhfVar = this.b;
            bhv bhvVar = (bhv) uhfVar.get(bhv.a);
            uhf basVar = bhvVar != null ? new bas(CoroutineExceptionHandler.c, bhvVar, this) : uhg.a;
            synchronized (this.d) {
                uhf uhfVar2 = this.e;
                if (uhfVar2 == null) {
                    uhfVarPlus = uhfVar.plus(new uon((uol) uhfVar.get(uol.c))).plus(this.c).plus(basVar);
                } else if (uhfVar2 == a) {
                    uon uonVar = new uon((uol) uhfVar.get(uol.c));
                    uonVar.s(new azc());
                    uhfVarPlus = uhfVar.plus(uonVar).plus(this.c).plus(basVar);
                } else {
                    uhfVarPlus = uhfVar2;
                }
                this.e = uhfVarPlus;
            }
        }
        uhfVarPlus.getClass();
        return uhfVarPlus;
    }

    public final void d() {
        synchronized (this.d) {
            uhf uhfVar = this.e;
            if (uhfVar == null) {
                this.e = a;
            } else {
                ujp.S(uhfVar, new azc());
            }
        }
    }

    @Override // defpackage.baq
    public final void cU() {
    }
}
