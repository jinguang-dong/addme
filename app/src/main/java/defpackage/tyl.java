package defpackage;

import com.google.vr.vrcore.controller.api.ControllerServiceBridge;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class tyl implements Runnable {
    public final /* synthetic */ ControllerServiceBridge a;
    public final /* synthetic */ int b;
    public final /* synthetic */ tyk c;
    private final /* synthetic */ int d;

    public /* synthetic */ tyl(ControllerServiceBridge controllerServiceBridge, int i, tyk tykVar, int i2) {
        this.d = i2;
        this.a = controllerServiceBridge;
        this.b = i;
        this.c = tykVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.d != 0) {
            tyk tykVar = this.c;
            this.a.c(this.b, tykVar);
        } else {
            tyk tykVar2 = this.c;
            this.a.c(this.b, tykVar2);
        }
    }
}
