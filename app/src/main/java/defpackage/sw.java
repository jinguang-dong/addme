package defpackage;

import android.content.BroadcastReceiver;
import com.google.android.apps.camera.wear.wearappv2.ui.countdown.WearCountdownView;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class sw extends uht implements uiu {
    final /* synthetic */ Object a;
    final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sw(WearCountdownView wearCountdownView, uif uifVar, uhb uhbVar, int i) {
        super(2, uhbVar);
        this.c = i;
        this.a = wearCountdownView;
        this.b = uifVar;
    }

    @Override // defpackage.uiu
    public final /* synthetic */ Object a(Object obj, Object obj2) {
        int i = this.c;
        if (i == 0) {
            return ((sw) c((und) obj, (uhb) obj2)).b(ufg.a);
        }
        if (i == 1) {
            return ((sw) c((und) obj, (uhb) obj2)).b(ufg.a);
        }
        if (i != 2) {
            return ((sw) c((und) obj, (uhb) obj2)).b(ufg.a);
        }
        return ((sw) c((und) obj, (uhb) obj2)).b(ufg.a);
    }

    /* JADX WARN: Type inference failed for: r2v8, types: [java.lang.Object, uif] */
    @Override // defpackage.uhn
    public final Object b(Object obj) throws Exception {
        int i = this.c;
        if (i == 0) {
            rnt.aN(obj);
            return ((ut) this.a).c((String) this.b);
        }
        if (i == 1) {
            rnt.aN(obj);
            Object obj2 = this.a;
            if (obj2 != null) {
                ((tm) obj2).h();
            }
            Object obj3 = this.b;
            if (obj3 != null) {
                ((us) obj3).a(null);
            }
            return ufg.a;
        }
        if (i == 2) {
            rnt.aN(obj);
            if (((Boolean) ((WearCountdownView) this.a).a.b.a()).booleanValue()) {
                this.b.a();
            }
            return ufg.a;
        }
        rnt.aN(obj);
        Object obj4 = this.a;
        obj4.getClass();
        rey.a((BroadcastReceiver.PendingResult) obj4);
        return ufg.a;
    }

    /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.Object, uif] */
    @Override // defpackage.uhn
    public final uhb c(Object obj, uhb uhbVar) {
        int i = this.c;
        if (i == 0) {
            return new sw((ut) this.a, (String) this.b, uhbVar, 0);
        }
        if (i == 1) {
            return new sw((tm) this.a, (us) this.b, uhbVar, 1);
        }
        if (i != 2) {
            return new sw((rey) this.b, (BroadcastReceiver.PendingResult) this.a, uhbVar, 3);
        }
        return new sw((WearCountdownView) this.a, (uif) this.b, uhbVar, 2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sw(rey reyVar, BroadcastReceiver.PendingResult pendingResult, uhb uhbVar, int i) {
        super(2, uhbVar);
        this.c = i;
        this.b = reyVar;
        this.a = pendingResult;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sw(tm tmVar, us usVar, uhb uhbVar, int i) {
        super(2, uhbVar);
        this.c = i;
        this.a = tmVar;
        this.b = usVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sw(ut utVar, String str, uhb uhbVar, int i) {
        super(2, uhbVar);
        this.c = i;
        this.a = utVar;
        this.b = str;
    }
}
