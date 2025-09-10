package defpackage;

import android.hardware.camera2.MultiResolutionImageReader;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class pkn implements por {
    public final por a;
    public boolean c;
    public int d;
    public boolean e;
    public final Object b = new Object();
    public final Map f = new LinkedHashMap();

    public pkn(por porVar) {
        this.a = porVar;
    }

    public final void a() {
        Object obj = this.b;
        synchronized (obj) {
            if (this.c) {
                return;
            }
            if (this.d == 0) {
                this.c = true;
                this.a.close();
                return;
            }
            synchronized (obj) {
                for (pkk pkkVar : this.f.values()) {
                    poj pojVarF = pkkVar.f();
                    if (pojVarF != null) {
                        pojVarF.close();
                    }
                    try {
                        pkkVar.h();
                    } catch (IllegalStateException unused) {
                    }
                }
            }
        }
    }

    @Override // defpackage.por, defpackage.ri
    public final Object c(ukx ukxVar) {
        int i = ukb.a;
        if (!ukxVar.equals(new uji(MultiResolutionImageReader.class))) {
            return null;
        }
        MultiResolutionImageReader multiResolutionImageReader = ((pji) this.a).a;
        multiResolutionImageReader.getClass();
        return multiResolutionImageReader;
    }

    @Override // defpackage.por, defpackage.paq, java.lang.AutoCloseable
    public final void close() {
        synchronized (this.b) {
            if (!this.c && !this.e) {
                this.e = true;
                a();
            }
        }
    }
}
