package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class rqz extends rqt {
    final /* synthetic */ IBinder a;
    final /* synthetic */ rrb b;

    public rqz(rrb rrbVar, IBinder iBinder) {
        this.a = iBinder;
        this.b = rrbVar;
    }

    @Override // defpackage.rqt
    public final void a() throws RemoteException {
        rqj rqjVar;
        IBinder iBinder = this.a;
        if (iBinder == null) {
            rqjVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.appupdate.protocol.IAppUpdateService");
            rqjVar = iInterfaceQueryLocalInterface instanceof rqj ? (rqj) iInterfaceQueryLocalInterface : new rqj(iBinder);
        }
        Object obj = this.b.a;
        rrc rrcVar = (rrc) obj;
        rrcVar.l = rqjVar;
        try {
            ((fbh) ((rrc) obj).l).a.linkToDeath(((rrc) obj).i, 0);
        } catch (RemoteException e) {
            rrcVar.m.e(e, "linkToDeath failed", new Object[0]);
        }
        rrc rrcVar2 = (rrc) this.b.a;
        rrcVar2.f = false;
        List list = rrcVar2.c;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
        list.clear();
    }
}
