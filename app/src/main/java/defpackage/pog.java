package defpackage;

import android.graphics.Rect;
import android.hardware.HardwareBuffer;
import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public class pog implements poj {
    protected final poj e;

    public pog(poj pojVar) {
        this.e = pojVar;
    }

    @Override // defpackage.poj
    public final int a() {
        return this.e.a();
    }

    @Override // defpackage.poj
    public final int b() {
        return this.e.b();
    }

    @Override // defpackage.poj
    public final int c() {
        return this.e.c();
    }

    public void close() {
        this.e.close();
    }

    @Override // defpackage.poj
    public long d() {
        return this.e.d();
    }

    @Override // defpackage.poj
    public final Rect e() {
        return this.e.e();
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof poj)) {
            return false;
        }
        poj pojVar = (poj) obj;
        return pojVar.a() == a() && pojVar.c() == c() && pojVar.b() == b() && pojVar.d() == d();
    }

    @Override // defpackage.poj
    public final HardwareBuffer f() {
        return this.e.f();
    }

    @Override // defpackage.poj
    public final List g() {
        return this.e.g();
    }

    @Override // defpackage.poj
    public final void h(pof pofVar) {
        this.e.h(pofVar);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(a()), Integer.valueOf(c()), Integer.valueOf(b()), Long.valueOf(d())});
    }

    @Override // defpackage.poj
    public final /* synthetic */ boolean i() {
        return false;
    }

    @Override // defpackage.pns
    public final qaq j() {
        return this.e.j();
    }

    public String toString() {
        return this.e.toString();
    }
}
