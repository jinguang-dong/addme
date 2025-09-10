package defpackage;

import kotlinx.coroutines.CoroutineExceptionHandler;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bas extends ugx implements CoroutineExceptionHandler {
    final /* synthetic */ bhv a;
    final /* synthetic */ bat b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bas(azn aznVar, bhv bhvVar, bat batVar) {
        super(aznVar);
        this.a = bhvVar;
        this.b = batVar;
    }

    @Override // kotlinx.coroutines.CoroutineExceptionHandler
    public final void handleException(uhf uhfVar, Throwable th) throws Throwable {
        bhv bhvVar = this.a;
        bat batVar = this.b;
        bhvVar.b(th, batVar);
        uhf uhfVar2 = batVar.c;
        azn aznVar = CoroutineExceptionHandler.c;
        uhfVar2.get(aznVar);
        CoroutineExceptionHandler coroutineExceptionHandler = (CoroutineExceptionHandler) batVar.b.get(aznVar);
        if (coroutineExceptionHandler == null) {
            throw th;
        }
        coroutineExceptionHandler.handleException(uhfVar, th);
    }
}
