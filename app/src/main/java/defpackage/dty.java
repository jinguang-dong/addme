package defpackage;

import android.os.Binder;
import androidx.window.extensions.area.WindowAreaComponent;
import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class dty {
    public duz a;
    public final dtx b;
    public final Binder c;
    public final WindowAreaComponent d;
    public final HashMap e = new HashMap();

    public dty(duz duzVar, dtx dtxVar, Binder binder, WindowAreaComponent windowAreaComponent) {
        this.a = duzVar;
        this.b = dtxVar;
        this.c = binder;
        this.d = windowAreaComponent;
    }

    public final dtq a(dto dtoVar) {
        dtq dtqVar = (dtq) this.e.get(dtoVar);
        return dtqVar == null ? new dtq(dtoVar, dtp.b) : dtqVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof dty)) {
            return false;
        }
        dty dtyVar = (dty) obj;
        return a.ao(this.a, dtyVar.a) && a.ao(this.b, dtyVar.b) && a.ao(this.e.entrySet(), dtyVar.e.entrySet());
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.e.entrySet().hashCode();
    }

    public final String toString() {
        return "WindowAreaInfo{ Metrics: " + this.a + ", type: " + this.b + ", Capabilities: " + this.e.entrySet() + " }";
    }
}
