package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
final class itj extends BroadcastReceiver {
    final /* synthetic */ itl a;

    public itj(itl itlVar) {
        this.a = itlVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String action = intent.getAction();
        if (action == null || !action.equals("com.google.android.apps.camera.remotecontrol.remotekey")) {
            return;
        }
        int intExtra = intent.getIntExtra("key_value", 0);
        boolean booleanExtra = intent.getBooleanExtra("key_down", false);
        switch (intExtra) {
            case 1:
                itl itlVar = this.a;
                itlVar.j.A = 3;
                synchronized (itlVar.f) {
                    Iterator it = itlVar.b.iterator();
                    while (it.hasNext()) {
                        ((itk) it.next()).f(booleanExtra);
                    }
                }
                break;
            case 2:
                itl itlVar2 = this.a;
                if (!booleanExtra) {
                    synchronized (itlVar2.f) {
                        Iterator it2 = itlVar2.b.iterator();
                        while (it2.hasNext()) {
                            ((itk) it2.next()).d();
                        }
                    }
                    break;
                }
                break;
            case 3:
                itl itlVar3 = this.a;
                synchronized (itlVar3.f) {
                    Iterator it3 = itlVar3.b.iterator();
                    while (it3.hasNext()) {
                        ((itk) it3.next()).b(booleanExtra);
                    }
                }
                break;
            case 4:
                itl itlVar4 = this.a;
                synchronized (itlVar4.f) {
                    Iterator it4 = itlVar4.b.iterator();
                    while (it4.hasNext()) {
                        ((itk) it4.next()).c(booleanExtra);
                    }
                }
                break;
            case 5:
                itl itlVar5 = this.a;
                synchronized (itlVar5.f) {
                    Iterator it5 = itlVar5.b.iterator();
                    while (it5.hasNext()) {
                        ((itk) it5.next()).g(booleanExtra);
                    }
                }
                break;
            case 6:
                itl itlVar6 = this.a;
                synchronized (itlVar6.f) {
                    Iterator it6 = itlVar6.b.iterator();
                    while (it6.hasNext()) {
                        ((itk) it6.next()).h(booleanExtra);
                    }
                }
                break;
            case 7:
                this.a.j(booleanExtra);
                break;
            case 8:
                itl itlVar7 = this.a;
                if (booleanExtra) {
                    synchronized (itlVar7.f) {
                        Iterator it7 = itlVar7.b.iterator();
                        while (it7.hasNext()) {
                            ((itk) it7.next()).e();
                        }
                    }
                    break;
                }
                break;
            case 9:
                itl itlVar8 = this.a;
                if (booleanExtra) {
                    synchronized (itlVar8.f) {
                        Iterator it8 = itlVar8.b.iterator();
                        while (it8.hasNext()) {
                            ((itk) it8.next()).c(false);
                        }
                    }
                    break;
                }
                break;
            default:
                ((sgt) itl.a.b().M(2316)).s("Unknown Key event received. Ignoring it.");
                break;
        }
        itl itlVar9 = this.a;
        synchronized (itlVar9.f) {
            Iterator it9 = itlVar9.e.iterator();
            while (it9.hasNext()) {
                ((nca) ((rnu) it9.next()).a).e();
            }
        }
    }
}
