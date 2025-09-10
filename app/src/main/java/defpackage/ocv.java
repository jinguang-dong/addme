package defpackage;

import com.google.android.gms.common.api.Status;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ocv extends ofo {
    public final /* synthetic */ ocw a;
    private final oca e;
    private final ocn f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ocv(ocw ocwVar, oca ocaVar, oew oewVar, ocn ocnVar) {
        super(oewVar);
        this.a = ocwVar;
        List list = occ.m;
        this.e = ocaVar;
        this.f = ocnVar;
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    protected final /* bridge */ /* synthetic */ ofc a(Status status) {
        return status;
    }

    public final void c() {
        ocw ocwVar = this.a;
        odd oddVarA = ode.c(ocwVar.b).a();
        if (oddVarA == null) {
            ocw.a.set(false);
            return;
        }
        ogw ogwVar = new ogw();
        ogwVar.a = new old(this, oddVarA, 1, null);
        ocwVar.e(ogwVar.a());
    }

    @Override // defpackage.ofo, defpackage.ofp
    public final /* bridge */ /* synthetic */ void d(Object obj) {
        super.k((ofc) obj);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0034, code lost:
    
        if (r4.hasNext() == false) goto L348;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0036, code lost:
    
        ((defpackage.oci) r4.next()).a(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0040, code lost:
    
        r4 = defpackage.occ.m.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x004a, code lost:
    
        if (r4.hasNext() == false) goto L350;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x004c, code lost:
    
        r0 = ((defpackage.ocb) r4.next()).a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0056, code lost:
    
        if (r0 != null) goto L351;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0059, code lost:
    
        r4 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0026, code lost:
    
        r4 = defpackage.ocq.a().a.iterator();
     */
    /* JADX WARN: Removed duplicated region for block: B:226:0x0464 A[Catch: all -> 0x0482, TryCatch #0 {, blocks: (B:169:0x033a, B:171:0x033e, B:173:0x034c, B:175:0x0358, B:177:0x0364, B:228:0x046c, B:230:0x0470, B:231:0x0477, B:178:0x036b, B:180:0x0375, B:181:0x0379, B:183:0x0388, B:185:0x038d, B:195:0x03ee, B:224:0x0460, B:226:0x0464, B:197:0x03f4, B:198:0x03f7, B:204:0x0406, B:205:0x0413, B:207:0x041b, B:208:0x0420, B:210:0x0424, B:213:0x042a, B:215:0x0441, B:217:0x0445, B:219:0x044d, B:221:0x0455, B:223:0x045c, B:227:0x0467, B:233:0x0479, B:234:0x047c, B:203:0x0403, B:235:0x047d, B:236:0x0480, B:182:0x037f, B:186:0x03a5, B:187:0x03aa, B:188:0x03ad, B:189:0x03c7, B:190:0x03cd, B:192:0x03d3, B:194:0x03e0, B:202:0x03fc), top: B:301:0x033a, inners: #1, #3, #10, #14 }] */
    /* JADX WARN: Removed duplicated region for block: B:236:0x0480 A[Catch: all -> 0x0482, DONT_GENERATE, TryCatch #0 {, blocks: (B:169:0x033a, B:171:0x033e, B:173:0x034c, B:175:0x0358, B:177:0x0364, B:228:0x046c, B:230:0x0470, B:231:0x0477, B:178:0x036b, B:180:0x0375, B:181:0x0379, B:183:0x0388, B:185:0x038d, B:195:0x03ee, B:224:0x0460, B:226:0x0464, B:197:0x03f4, B:198:0x03f7, B:204:0x0406, B:205:0x0413, B:207:0x041b, B:208:0x0420, B:210:0x0424, B:213:0x042a, B:215:0x0441, B:217:0x0445, B:219:0x044d, B:221:0x0455, B:223:0x045c, B:227:0x0467, B:233:0x0479, B:234:0x047c, B:203:0x0403, B:235:0x047d, B:236:0x0480, B:182:0x037f, B:186:0x03a5, B:187:0x03aa, B:188:0x03ad, B:189:0x03c7, B:190:0x03cd, B:192:0x03d3, B:194:0x03e0, B:202:0x03fc), top: B:301:0x033a, inners: #1, #3, #10, #14 }] */
    /* JADX WARN: Removed duplicated region for block: B:289:0x0581  */
    /* JADX WARN: Removed duplicated region for block: B:313:0x0161 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:320:0x04dc A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object, java.util.List] */
    @Override // defpackage.ofo
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final /* synthetic */ void b(defpackage.oej r26) throws java.lang.NumberFormatException, defpackage.oub {
        /*
            Method dump skipped, instructions count: 1497
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ocv.b(oej):void");
    }
}
