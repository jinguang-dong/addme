package defpackage;

import android.graphics.Bitmap;
import android.widget.ListView;
import androidx.wear.ambient.WearableControllerProvider;
import com.google.vr.vrcore.controller.api.ControllerServiceBridge;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tym {
    public final int a;
    public final Object b;
    public final Object c;

    public tym(Bitmap bitmap, int i, pas pasVar) {
        this.c = bitmap;
        this.a = i;
        this.b = pasVar;
    }

    public final qji a(qkl qklVar) {
        qkr qkrVar = (qkr) this.b;
        a.I(qkrVar.a.b == qklVar.b);
        return new qji(this.a, qkrVar, (qju) this.c, qklVar);
    }

    public final int b(Object obj) {
        zm zmVar = (zm) this.b;
        int iA = zmVar.a(obj);
        if (iA >= 0) {
            return zmVar.c[iA];
        }
        return -1;
    }

    public final ListView c() {
        return ((jz) this.c).e;
    }

    public tym(ControllerServiceBridge.Callbacks callbacks, tyh tyhVar, int i) {
        this.b = callbacks;
        this.c = tyhVar;
        this.a = i;
    }

    public tym(kc kcVar, gb gbVar, int i) {
        this.c = kcVar;
        this.b = gbVar;
        this.a = i;
    }

    public tym(int i, qkr qkrVar, qju qjuVar) {
        boolean z = true;
        if (qjuVar != null && qjuVar.a.b != qkrVar.a.b) {
            z = false;
        }
        a.I(z);
        this.a = i;
        this.b = qkrVar;
        this.c = qjuVar;
    }

    public tym(ukv ukvVar, ebn ebnVar) {
        Object obj = ebnVar.b;
        int i = ukvVar.a;
        ogk ogkVar = (ogk) obj;
        int iMin = Math.min(ukvVar.b, ogkVar.a - 1);
        if (iMin < i) {
            this.b = zn.a();
            this.c = new Object[0];
            this.a = 0;
            return;
        }
        int i2 = (iMin - i) + 1;
        this.c = new Object[i2];
        this.a = i;
        zm zmVar = new zm(i2);
        ndf ndfVar = new ndf(i, iMin, zmVar, this, 1);
        bdp bdpVar = (bdp) ogkVar.b;
        int iC = WearableControllerProvider.c(bdpVar, i);
        int i3 = ((nw) bdpVar.a[iC]).a;
        while (i3 <= iMin) {
            nw nwVar = (nw) bdpVar.a[iC];
            ndfVar.a(nwVar);
            i3 += nwVar.b;
            iC++;
        }
        this.b = zmVar;
    }
}
