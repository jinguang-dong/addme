package defpackage;

import android.support.v8.renderscript.ScriptIntrinsicBLAS;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bfv implements bfs {
    public static final bgb d = new bgb(new ane(5), new aks(7));
    public final Map a;
    public bfx b;
    public final zu c;
    private final uiq e;

    public bfv() {
        this((byte[]) null);
    }

    public final void a(bfx bfxVar, Map map, Object obj) {
        Map mapB = bfxVar.b();
        if (mapB.isEmpty()) {
            map.remove(obj);
        } else {
            map.put(obj, mapB);
        }
    }

    @Override // defpackage.bfs
    public final void c(Object obj, uiu uiuVar, ayc aycVar, int i) {
        int i2;
        int i3 = i & 6;
        ayc aycVarC = aycVar.c(533563200);
        if (i3 == 0) {
            i2 = (true != aycVarC.D(obj) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != aycVarC.D(uiuVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != aycVarC.D(this) ? 128 : 256;
        }
        int i4 = 0;
        if (aycVarC.H((i2 & 147) != 146, i2 & 1)) {
            aycVarC.K(obj);
            ayg aygVar = (ayg) aycVarC;
            Object objR = aygVar.R();
            Object obj2 = ayb.a;
            if (objR == obj2) {
                uiq uiqVar = this.e;
                if (!((Boolean) uiqVar.a(obj)).booleanValue()) {
                    throw new IllegalArgumentException(a.bz(obj, "Type of the key ", " is not supported. On Android you can only use types which can be stored inside the Bundle."));
                }
                bga bgaVar = new bga(new bfy((Map) this.a.get(obj), uiqVar));
                aygVar.ac(bgaVar);
                objR = bgaVar;
            }
            bga bgaVar2 = (bga) objR;
            bay.L(new bag[]{bfz.a.b(bgaVar2), dew.a.b(bgaVar2)}, uiuVar, aycVarC, (i2 & ScriptIntrinsicBLAS.TRANSPOSE) | 8);
            ufg ufgVar = ufg.a;
            boolean zD = aycVarC.D(this) | aycVarC.D(obj) | aycVarC.D(bgaVar2);
            Object objR2 = aygVar.R();
            if (zD || objR2 == obj2) {
                objR2 = new bft(this, obj, bgaVar2, i4);
                aygVar.ac(objR2);
            }
            azb.c(ufgVar, (uiq) objR2, aycVarC);
            aycVarC.p();
        } else {
            aycVarC.r();
        }
        bai baiVarI = aycVarC.I();
        if (baiVarI != null) {
            baiVarI.d = new apc(this, obj, uiuVar, i, 6);
        }
    }

    @Override // defpackage.bfs
    public final void d(Object obj) {
        if (this.c.g(obj) == null) {
            this.a.remove(obj);
        }
    }

    public bfv(Map map) {
        this.a = map;
        long[] jArr = zv.a;
        this.c = new zu((byte[]) null);
        this.e = new arc(this, 7);
    }

    public /* synthetic */ bfv(byte[] bArr) {
        this(new LinkedHashMap());
    }
}
