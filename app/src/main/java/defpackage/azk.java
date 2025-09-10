package defpackage;

import kotlinx.coroutines.CoroutineExceptionHandler;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class azk implements CoroutineExceptionHandler, baq {
    private final uhf a;
    private final uiu b;
    private final und d;
    private uol e;

    public azk(uhf uhfVar, uiu uiuVar) {
        this.a = uhfVar;
        this.b = uiuVar;
        this.d = ung.j(uhfVar.plus(uhfVar.get(bhv.a) != null ? this : uhg.a));
    }

    @Override // defpackage.baq
    public final void a() {
        uol uolVar = this.e;
        if (uolVar != null) {
            uolVar.s(new azm());
        }
        this.e = null;
    }

    @Override // defpackage.baq
    public final void b() {
        uol uolVar = this.e;
        if (uolVar != null) {
            uolVar.s(new azm());
        }
        this.e = null;
    }

    @Override // defpackage.baq
    public final void cU() {
        uol uolVar = this.e;
        if (uolVar != null) {
            uolVar.s(ujo.b("Old job was still running!", null));
        }
        this.e = ukc.C(this.d, null, 0, this.b, 3);
    }

    @Override // defpackage.uhf
    public final Object fold(Object obj, uiu uiuVar) {
        return ske.aF(this, obj, uiuVar);
    }

    @Override // defpackage.uhd, defpackage.uhf
    public final uhd get(uhe uheVar) {
        return ske.aG(this, uheVar);
    }

    @Override // defpackage.uhd
    public final uhe getKey() {
        return CoroutineExceptionHandler.c;
    }

    @Override // kotlinx.coroutines.CoroutineExceptionHandler
    public final void handleException(uhf uhfVar, Throwable th) throws Throwable {
        bhv bhvVar = (bhv) uhfVar.get(bhv.a);
        if (bhvVar != null) {
            bhvVar.b(th, this);
        }
        CoroutineExceptionHandler coroutineExceptionHandler = (CoroutineExceptionHandler) this.a.get(CoroutineExceptionHandler.c);
        if (coroutineExceptionHandler == null) {
            throw th;
        }
        coroutineExceptionHandler.handleException(uhfVar, th);
    }

    @Override // defpackage.uhf
    public final uhf minusKey(uhe uheVar) {
        return ske.aH(this, uheVar);
    }

    @Override // defpackage.uhf
    public final uhf plus(uhf uhfVar) {
        return ske.aI(this, uhfVar);
    }
}
