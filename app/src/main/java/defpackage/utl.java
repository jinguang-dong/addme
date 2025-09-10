package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class utl extends utr implements urk, uuj, utj, usr {
    private final umb a;
    private int b;

    public utl(Object obj) {
        this.a = new umb(obj, umc.a);
    }

    private final boolean g(Object obj, Object obj2) {
        int i;
        utt[] uttVarArr;
        uwc uwcVar;
        synchronized (this) {
            umb umbVar = this.a;
            Object obj3 = umbVar.a;
            if (obj != null && !a.ao(obj3, obj)) {
                return false;
            }
            if (a.ao(obj3, obj2)) {
                return true;
            }
            umbVar.c(obj2);
            int i2 = this.b;
            if ((i2 & 1) != 0) {
                this.b = i2 + 2;
                return true;
            }
            int i3 = i2 + 1;
            this.b = i3;
            utt[] uttVarArr2 = this.d;
            while (true) {
                utn[] utnVarArr = (utn[]) uttVarArr2;
                if (utnVarArr != null) {
                    for (utn utnVar : utnVarArr) {
                        if (utnVar != null) {
                            while (true) {
                                AtomicReference atomicReference = utnVar.a;
                                Object obj4 = atomicReference.get();
                                if (obj4 != null && obj4 != (uwcVar = utm.b)) {
                                    uwc uwcVar2 = utm.a;
                                    if (obj4 != uwcVar2) {
                                        if (a.v(atomicReference, obj4, uwcVar2)) {
                                            ((uml) obj4).fW(ufg.a);
                                            break;
                                        }
                                    } else {
                                        if (a.v(atomicReference, obj4, uwcVar)) {
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                synchronized (this) {
                    i = this.b;
                    if (i == i3) {
                        this.b = i3 + 1;
                        return true;
                    }
                    uttVarArr = this.d;
                }
                uttVarArr2 = uttVarArr;
                i3 = i;
            }
        }
    }

    @Override // defpackage.usr, defpackage.url
    public final Object a(Object obj, uhb uhbVar) {
        e(obj);
        return ufg.a;
    }

    @Override // defpackage.utj
    public final Object c() {
        uwc uwcVar = uum.a;
        Object obj = this.a.a;
        if (obj == uwcVar) {
            return null;
        }
        return obj;
    }

    @Override // defpackage.usr
    public final boolean d(Object obj) {
        e(obj);
        return true;
    }

    public final void e(Object obj) {
        if (obj == null) {
            obj = uum.a;
        }
        g(null, obj);
    }

    public final boolean f(Object obj, Object obj2) {
        if (obj == null) {
            obj = uum.a;
        }
        if (obj2 == null) {
            obj2 = uum.a;
        }
        return g(obj, obj2);
    }

    @Override // defpackage.uuj
    public final urk gb(uhf uhfVar, int i, int i2) {
        return utm.b(this, uhfVar, i, i2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0081, code lost:
    
        if (defpackage.a.ao(r13, r14) == false) goto L36;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 7, insn: 0x00e3: INVOKE (r12v0 ?? I:utr), (r7 I:utt) VIRTUAL call: utr.m(utt):void A[MD:(utt):void (m)] (LINE:228), block:B:56:0x00e3 */
    /* JADX WARN: Path cross not found for [B:30:0x0072, B:45:0x00ac], limit reached: 55 */
    /* JADX WARN: Path cross not found for [B:34:0x007d, B:36:0x0083], limit reached: 55 */
    /* JADX WARN: Path cross not found for [B:36:0x0083, B:34:0x007d], limit reached: 55 */
    /* JADX WARN: Path cross not found for [B:36:0x0083, B:43:0x009b], limit reached: 55 */
    /* JADX WARN: Path cross not found for [B:45:0x00ac, B:30:0x0072], limit reached: 55 */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0078 A[Catch: all -> 0x0052, TryCatch #0 {all -> 0x0052, blocks: (B:14:0x0032, B:30:0x0072, B:32:0x0078, B:34:0x007d, B:43:0x009b, B:45:0x00ac, B:47:0x00c8, B:48:0x00cd, B:50:0x00d3, B:36:0x0083, B:40:0x008a, B:19:0x0046, B:22:0x004e, B:29:0x0063, B:27:0x005f, B:54:0x00d9, B:55:0x00e2), top: B:58:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x007d A[Catch: all -> 0x0052, TryCatch #0 {all -> 0x0052, blocks: (B:14:0x0032, B:30:0x0072, B:32:0x0078, B:34:0x007d, B:43:0x009b, B:45:0x00ac, B:47:0x00c8, B:48:0x00cd, B:50:0x00d3, B:36:0x0083, B:40:0x008a, B:19:0x0046, B:22:0x004e, B:29:0x0063, B:27:0x005f, B:54:0x00d9, B:55:0x00e2), top: B:58:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00ac A[Catch: all -> 0x0052, TryCatch #0 {all -> 0x0052, blocks: (B:14:0x0032, B:30:0x0072, B:32:0x0078, B:34:0x007d, B:43:0x009b, B:45:0x00ac, B:47:0x00c8, B:48:0x00cd, B:50:0x00d3, B:36:0x0083, B:40:0x008a, B:19:0x0046, B:22:0x004e, B:29:0x0063, B:27:0x005f, B:54:0x00d9, B:55:0x00e2), top: B:58:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:44:0x00aa -> B:30:0x0072). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:52:0x00d7 -> B:30:0x0072). Please report as a decompilation issue!!! */
    @Override // defpackage.urk
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object gc(defpackage.url r13, defpackage.uhb r14) {
        /*
            Method dump skipped, instructions count: 231
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.utl.gc(url, uhb):java.lang.Object");
    }

    @Override // defpackage.usr
    public final void gd() {
        throw new UnsupportedOperationException("MutableStateFlow.resetReplayCache is not supported");
    }

    @Override // defpackage.utr
    public final /* synthetic */ utt h() {
        return new utn();
    }

    @Override // defpackage.utr
    public final /* bridge */ /* synthetic */ utt[] k() {
        return new utn[2];
    }
}
