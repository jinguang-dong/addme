package defpackage;

import android.content.BroadcastReceiver;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class rew extends uht implements uiu {
    final /* synthetic */ BroadcastReceiver.PendingResult a;
    final /* synthetic */ String b;
    final /* synthetic */ rey c;
    final /* synthetic */ long d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rew(BroadcastReceiver.PendingResult pendingResult, String str, rey reyVar, long j, uhb uhbVar) {
        super(2, uhbVar);
        this.a = pendingResult;
        this.b = str;
        this.c = reyVar;
        this.d = j;
    }

    @Override // defpackage.uiu
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((rew) c((und) obj, (uhb) obj2)).b(ufg.a);
    }

    @Override // defpackage.uhn
    public final Object b(Object obj) {
        rnt.aN(obj);
        BroadcastReceiver.PendingResult pendingResult = this.a;
        String str = this.b;
        pendingResult.setResultData(str);
        pendingResult.setResultCode(-1);
        pendingResult.getClass();
        rey.a(pendingResult);
        TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - this.d);
        str.length();
        return new Integer(0);
    }

    @Override // defpackage.uhn
    public final uhb c(Object obj, uhb uhbVar) {
        return new rew(this.a, this.b, this.c, this.d, uhbVar);
    }
}
