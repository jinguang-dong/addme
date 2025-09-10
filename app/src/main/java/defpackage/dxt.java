package defpackage;

import android.content.Context;
import androidx.work.impl.background.systemalarm.RescheduleReceiver;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class dxt extends uht implements uiu {
    /* synthetic */ boolean a;
    final /* synthetic */ Context b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dxt(Context context, uhb uhbVar) {
        super(2, uhbVar);
        this.b = context;
    }

    @Override // defpackage.uiu
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        return ((dxt) c(bool, (uhb) obj2)).b(ufg.a);
    }

    @Override // defpackage.uhn
    public final Object b(Object obj) {
        rnt.aN(obj);
        ecz.a(this.b, RescheduleReceiver.class, this.a);
        return ufg.a;
    }

    @Override // defpackage.uhn
    public final uhb c(Object obj, uhb uhbVar) {
        dxt dxtVar = new dxt(this.b, uhbVar);
        dxtVar.a = ((Boolean) obj).booleanValue();
        return dxtVar;
    }
}
