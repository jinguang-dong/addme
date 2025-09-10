package defpackage;

import android.graphics.Bitmap;
import com.google.ar.core.R;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class ijg implements llo {
    private static final sgv b = sgv.g("ijg");
    public final lss a;
    private final boolean c;
    private final ikv d = (ikv) ilh.a(ikv.class);
    private final ili e = (ili) ilh.a(ili.class);
    private final fse f;
    private final List g;
    private final pbn h;
    private final boolean i;
    private final iix j;
    private final hbj k;
    private final ocq l;

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, uem] */
    public ijg(ggg gggVar, lrp lrpVar, ocq ocqVar, pbn pbnVar, jid jidVar, owq owqVar, hbj hbjVar, qqq qqqVar, iix iixVar, Bitmap bitmap, boolean z) {
        this.j = iixVar;
        this.c = ((Boolean) owqVar.dL()).booleanValue();
        gzg gzgVar = gzu.a;
        this.g = new ArrayList();
        this.h = pbnVar;
        fse fseVarA = jidVar.a();
        this.f = fseVarA;
        this.l = ocqVar;
        this.i = z;
        this.k = hbjVar;
        lry lryVar = new lry((lrm) gggVar.a.a(), String.valueOf(iixVar.a).concat(".vr"), fseVarA, qqqVar.t(System.currentTimeMillis()));
        this.a = lryVar;
        pbnVar.h("imaxProcessing#startSession");
        lrpVar.c(lryVar);
        lryVar.Z(new pas(bitmap.getWidth(), bitmap.getHeight()));
        lryVar.ae(bitmap, true != z ? 0 : 270);
        lryVar.X(new nfp(R.string.processing_panorama, new Object[0]));
        pbnVar.g();
    }

    @Override // defpackage.llo
    public final /* synthetic */ lln a() {
        return this.a;
    }

    @Override // defpackage.llo
    public final String b() {
        return "ImaxProcessingTask-".concat(String.valueOf(String.valueOf(this.a.l())));
    }

    @Override // defpackage.llo
    public final void c(paf pafVar) {
        pafVar.getClass();
        this.g.add(pafVar);
    }

    @Override // defpackage.llo
    public final void e(paf pafVar) {
        this.g.remove(pafVar);
    }

    @Override // defpackage.llo
    public final void f() {
    }

    @Override // defpackage.llo
    public final void g() {
    }

    /* JADX WARN: Can't wrap try/catch for region: R(27:27|(9:29|237|30|31|246|32|33|(1:(2:35|(2:274|37)(1:38))(2:273|39))|(4:41|44|(1:46)(3:47|(2:48|(1:278)(2:(5:80|81|260|82|280)(2:83|279)|84))|50)|(5:52|85|86|(1:88)(1:89)|90)(9:53|266|54|55|(4:57|268|58|(1:61)(0))|248|64|75|(6:77|52|85|86|(0)(0)|90)(4:78|86|(0)(0)|90)))(3:42|(0)(0)|(0)(0)))(1:91)|92|(5:239|94|240|95|96)(1:107)|108|(4:242|109|(1:111)|112)|(5:(26:114|115|(0)(5:263|118|119|(3:252|120|(7:122|(1:124)(1:125)|126|(1:128)|129|(2:131|276)(1:277)|132)(1:275))|133)|138|(1:140)|(1:142)|(1:144)|(1:146)|(1:148)|(1:150)|(1:152)|(1:154)|(1:156)|(3:160|(1:162)(1:163)|(1:172))|(1:174)|(1:176)|(1:178)|179|180|187|270|188|254|189|190|203)(1:136)|254|189|190|203)|137|138|(0)|(0)|(0)|(0)|(0)|(0)|(0)|(0)|(0)|(4:158|160|(0)(0)|(4:165|168|170|172))|(0)|(0)|(0)|179|180|187|270|188) */
    /* JADX WARN: Code restructure failed: missing block: B:199:0x049b, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:200:0x049c, code lost:
    
        ((defpackage.sgt) ((defpackage.sgt) defpackage.ijg.b.b().i(r0)).M(2067)).s("Unable to read file for saving");
     */
    /* JADX WARN: Code restructure failed: missing block: B:201:0x04aa, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:202:0x04ab, code lost:
    
        ((defpackage.sgt) ((defpackage.sgt) defpackage.ijg.b.b().i(r0)).M(2066)).s("File not found for saving");
     */
    /* JADX WARN: Removed duplicated region for block: B:140:0x03a8 A[Catch: IOException -> 0x044b, Exception -> 0x04fa, all -> 0x053a, TryCatch #8 {IOException -> 0x044b, blocks: (B:120:0x033a, B:122:0x033d, B:128:0x035c, B:129:0x0361, B:131:0x0368, B:132:0x036d, B:133:0x0374, B:138:0x0389, B:140:0x03a8, B:142:0x03af, B:144:0x03b6, B:146:0x03bd, B:148:0x03c4, B:150:0x03cb, B:152:0x03d2, B:154:0x03d9, B:156:0x03e0, B:158:0x03e9, B:160:0x03ef, B:162:0x03f7, B:165:0x03fd, B:168:0x0401, B:170:0x0406, B:172:0x040c, B:174:0x0413, B:176:0x0424, B:178:0x0437, B:179:0x0446), top: B:252:0x033a }] */
    /* JADX WARN: Removed duplicated region for block: B:142:0x03af A[Catch: IOException -> 0x044b, Exception -> 0x04fa, all -> 0x053a, TryCatch #8 {IOException -> 0x044b, blocks: (B:120:0x033a, B:122:0x033d, B:128:0x035c, B:129:0x0361, B:131:0x0368, B:132:0x036d, B:133:0x0374, B:138:0x0389, B:140:0x03a8, B:142:0x03af, B:144:0x03b6, B:146:0x03bd, B:148:0x03c4, B:150:0x03cb, B:152:0x03d2, B:154:0x03d9, B:156:0x03e0, B:158:0x03e9, B:160:0x03ef, B:162:0x03f7, B:165:0x03fd, B:168:0x0401, B:170:0x0406, B:172:0x040c, B:174:0x0413, B:176:0x0424, B:178:0x0437, B:179:0x0446), top: B:252:0x033a }] */
    /* JADX WARN: Removed duplicated region for block: B:144:0x03b6 A[Catch: IOException -> 0x044b, Exception -> 0x04fa, all -> 0x053a, TryCatch #8 {IOException -> 0x044b, blocks: (B:120:0x033a, B:122:0x033d, B:128:0x035c, B:129:0x0361, B:131:0x0368, B:132:0x036d, B:133:0x0374, B:138:0x0389, B:140:0x03a8, B:142:0x03af, B:144:0x03b6, B:146:0x03bd, B:148:0x03c4, B:150:0x03cb, B:152:0x03d2, B:154:0x03d9, B:156:0x03e0, B:158:0x03e9, B:160:0x03ef, B:162:0x03f7, B:165:0x03fd, B:168:0x0401, B:170:0x0406, B:172:0x040c, B:174:0x0413, B:176:0x0424, B:178:0x0437, B:179:0x0446), top: B:252:0x033a }] */
    /* JADX WARN: Removed duplicated region for block: B:146:0x03bd A[Catch: IOException -> 0x044b, Exception -> 0x04fa, all -> 0x053a, TryCatch #8 {IOException -> 0x044b, blocks: (B:120:0x033a, B:122:0x033d, B:128:0x035c, B:129:0x0361, B:131:0x0368, B:132:0x036d, B:133:0x0374, B:138:0x0389, B:140:0x03a8, B:142:0x03af, B:144:0x03b6, B:146:0x03bd, B:148:0x03c4, B:150:0x03cb, B:152:0x03d2, B:154:0x03d9, B:156:0x03e0, B:158:0x03e9, B:160:0x03ef, B:162:0x03f7, B:165:0x03fd, B:168:0x0401, B:170:0x0406, B:172:0x040c, B:174:0x0413, B:176:0x0424, B:178:0x0437, B:179:0x0446), top: B:252:0x033a }] */
    /* JADX WARN: Removed duplicated region for block: B:148:0x03c4 A[Catch: IOException -> 0x044b, Exception -> 0x04fa, all -> 0x053a, TryCatch #8 {IOException -> 0x044b, blocks: (B:120:0x033a, B:122:0x033d, B:128:0x035c, B:129:0x0361, B:131:0x0368, B:132:0x036d, B:133:0x0374, B:138:0x0389, B:140:0x03a8, B:142:0x03af, B:144:0x03b6, B:146:0x03bd, B:148:0x03c4, B:150:0x03cb, B:152:0x03d2, B:154:0x03d9, B:156:0x03e0, B:158:0x03e9, B:160:0x03ef, B:162:0x03f7, B:165:0x03fd, B:168:0x0401, B:170:0x0406, B:172:0x040c, B:174:0x0413, B:176:0x0424, B:178:0x0437, B:179:0x0446), top: B:252:0x033a }] */
    /* JADX WARN: Removed duplicated region for block: B:150:0x03cb A[Catch: IOException -> 0x044b, Exception -> 0x04fa, all -> 0x053a, TryCatch #8 {IOException -> 0x044b, blocks: (B:120:0x033a, B:122:0x033d, B:128:0x035c, B:129:0x0361, B:131:0x0368, B:132:0x036d, B:133:0x0374, B:138:0x0389, B:140:0x03a8, B:142:0x03af, B:144:0x03b6, B:146:0x03bd, B:148:0x03c4, B:150:0x03cb, B:152:0x03d2, B:154:0x03d9, B:156:0x03e0, B:158:0x03e9, B:160:0x03ef, B:162:0x03f7, B:165:0x03fd, B:168:0x0401, B:170:0x0406, B:172:0x040c, B:174:0x0413, B:176:0x0424, B:178:0x0437, B:179:0x0446), top: B:252:0x033a }] */
    /* JADX WARN: Removed duplicated region for block: B:152:0x03d2 A[Catch: IOException -> 0x044b, Exception -> 0x04fa, all -> 0x053a, TryCatch #8 {IOException -> 0x044b, blocks: (B:120:0x033a, B:122:0x033d, B:128:0x035c, B:129:0x0361, B:131:0x0368, B:132:0x036d, B:133:0x0374, B:138:0x0389, B:140:0x03a8, B:142:0x03af, B:144:0x03b6, B:146:0x03bd, B:148:0x03c4, B:150:0x03cb, B:152:0x03d2, B:154:0x03d9, B:156:0x03e0, B:158:0x03e9, B:160:0x03ef, B:162:0x03f7, B:165:0x03fd, B:168:0x0401, B:170:0x0406, B:172:0x040c, B:174:0x0413, B:176:0x0424, B:178:0x0437, B:179:0x0446), top: B:252:0x033a }] */
    /* JADX WARN: Removed duplicated region for block: B:154:0x03d9 A[Catch: IOException -> 0x044b, Exception -> 0x04fa, all -> 0x053a, TryCatch #8 {IOException -> 0x044b, blocks: (B:120:0x033a, B:122:0x033d, B:128:0x035c, B:129:0x0361, B:131:0x0368, B:132:0x036d, B:133:0x0374, B:138:0x0389, B:140:0x03a8, B:142:0x03af, B:144:0x03b6, B:146:0x03bd, B:148:0x03c4, B:150:0x03cb, B:152:0x03d2, B:154:0x03d9, B:156:0x03e0, B:158:0x03e9, B:160:0x03ef, B:162:0x03f7, B:165:0x03fd, B:168:0x0401, B:170:0x0406, B:172:0x040c, B:174:0x0413, B:176:0x0424, B:178:0x0437, B:179:0x0446), top: B:252:0x033a }] */
    /* JADX WARN: Removed duplicated region for block: B:156:0x03e0 A[Catch: IOException -> 0x044b, Exception -> 0x04fa, all -> 0x053a, TryCatch #8 {IOException -> 0x044b, blocks: (B:120:0x033a, B:122:0x033d, B:128:0x035c, B:129:0x0361, B:131:0x0368, B:132:0x036d, B:133:0x0374, B:138:0x0389, B:140:0x03a8, B:142:0x03af, B:144:0x03b6, B:146:0x03bd, B:148:0x03c4, B:150:0x03cb, B:152:0x03d2, B:154:0x03d9, B:156:0x03e0, B:158:0x03e9, B:160:0x03ef, B:162:0x03f7, B:165:0x03fd, B:168:0x0401, B:170:0x0406, B:172:0x040c, B:174:0x0413, B:176:0x0424, B:178:0x0437, B:179:0x0446), top: B:252:0x033a }] */
    /* JADX WARN: Removed duplicated region for block: B:162:0x03f7 A[Catch: IOException -> 0x044b, Exception -> 0x04fa, all -> 0x053a, TryCatch #8 {IOException -> 0x044b, blocks: (B:120:0x033a, B:122:0x033d, B:128:0x035c, B:129:0x0361, B:131:0x0368, B:132:0x036d, B:133:0x0374, B:138:0x0389, B:140:0x03a8, B:142:0x03af, B:144:0x03b6, B:146:0x03bd, B:148:0x03c4, B:150:0x03cb, B:152:0x03d2, B:154:0x03d9, B:156:0x03e0, B:158:0x03e9, B:160:0x03ef, B:162:0x03f7, B:165:0x03fd, B:168:0x0401, B:170:0x0406, B:172:0x040c, B:174:0x0413, B:176:0x0424, B:178:0x0437, B:179:0x0446), top: B:252:0x033a }] */
    /* JADX WARN: Removed duplicated region for block: B:163:0x03fa  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0413 A[Catch: IOException -> 0x044b, Exception -> 0x04fa, all -> 0x053a, TryCatch #8 {IOException -> 0x044b, blocks: (B:120:0x033a, B:122:0x033d, B:128:0x035c, B:129:0x0361, B:131:0x0368, B:132:0x036d, B:133:0x0374, B:138:0x0389, B:140:0x03a8, B:142:0x03af, B:144:0x03b6, B:146:0x03bd, B:148:0x03c4, B:150:0x03cb, B:152:0x03d2, B:154:0x03d9, B:156:0x03e0, B:158:0x03e9, B:160:0x03ef, B:162:0x03f7, B:165:0x03fd, B:168:0x0401, B:170:0x0406, B:172:0x040c, B:174:0x0413, B:176:0x0424, B:178:0x0437, B:179:0x0446), top: B:252:0x033a }] */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0424 A[Catch: IOException -> 0x044b, Exception -> 0x04fa, all -> 0x053a, TryCatch #8 {IOException -> 0x044b, blocks: (B:120:0x033a, B:122:0x033d, B:128:0x035c, B:129:0x0361, B:131:0x0368, B:132:0x036d, B:133:0x0374, B:138:0x0389, B:140:0x03a8, B:142:0x03af, B:144:0x03b6, B:146:0x03bd, B:148:0x03c4, B:150:0x03cb, B:152:0x03d2, B:154:0x03d9, B:156:0x03e0, B:158:0x03e9, B:160:0x03ef, B:162:0x03f7, B:165:0x03fd, B:168:0x0401, B:170:0x0406, B:172:0x040c, B:174:0x0413, B:176:0x0424, B:178:0x0437, B:179:0x0446), top: B:252:0x033a }] */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0437 A[Catch: IOException -> 0x044b, Exception -> 0x04fa, all -> 0x053a, TryCatch #8 {IOException -> 0x044b, blocks: (B:120:0x033a, B:122:0x033d, B:128:0x035c, B:129:0x0361, B:131:0x0368, B:132:0x036d, B:133:0x0374, B:138:0x0389, B:140:0x03a8, B:142:0x03af, B:144:0x03b6, B:146:0x03bd, B:148:0x03c4, B:150:0x03cb, B:152:0x03d2, B:154:0x03d9, B:156:0x03e0, B:158:0x03e9, B:160:0x03ef, B:162:0x03f7, B:165:0x03fd, B:168:0x0401, B:170:0x0406, B:172:0x040c, B:174:0x0413, B:176:0x0424, B:178:0x0437, B:179:0x0446), top: B:252:0x033a }] */
    /* JADX WARN: Removed duplicated region for block: B:206:0x04ca A[LOOP:0: B:205:0x04c8->B:206:0x04ca, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:208:0x04d8  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x0539 A[ADDED_TO_REGION, ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0163 A[Catch: all -> 0x04fc, Exception -> 0x0500, TryCatch #24 {Exception -> 0x0500, all -> 0x04fc, blocks: (B:3:0x000f, B:5:0x0015, B:8:0x001a, B:10:0x001e, B:11:0x002c, B:12:0x0042, B:15:0x005b, B:17:0x0062, B:19:0x006c, B:20:0x00ba, B:24:0x00d0, B:27:0x00df, B:29:0x00e8, B:30:0x00fd, B:31:0x0107, B:32:0x0110, B:33:0x0113, B:35:0x011a, B:41:0x0131, B:46:0x0163, B:53:0x019e, B:69:0x01c3, B:70:0x01c6, B:73:0x01ca, B:75:0x01ce, B:78:0x01d4, B:64:0x01bb, B:47:0x0178, B:48:0x018c, B:50:0x0192, B:80:0x01e2, B:42:0x0145, B:38:0x012b, B:43:0x014d, B:23:0x00bf, B:18:0x0069), top: B:265:0x000f }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0178 A[Catch: all -> 0x04fc, Exception -> 0x0500, TryCatch #24 {Exception -> 0x0500, all -> 0x04fc, blocks: (B:3:0x000f, B:5:0x0015, B:8:0x001a, B:10:0x001e, B:11:0x002c, B:12:0x0042, B:15:0x005b, B:17:0x0062, B:19:0x006c, B:20:0x00ba, B:24:0x00d0, B:27:0x00df, B:29:0x00e8, B:30:0x00fd, B:31:0x0107, B:32:0x0110, B:33:0x0113, B:35:0x011a, B:41:0x0131, B:46:0x0163, B:53:0x019e, B:69:0x01c3, B:70:0x01c6, B:73:0x01ca, B:75:0x01ce, B:78:0x01d4, B:64:0x01bb, B:47:0x0178, B:48:0x018c, B:50:0x0192, B:80:0x01e2, B:42:0x0145, B:38:0x012b, B:43:0x014d, B:23:0x00bf, B:18:0x0069), top: B:265:0x000f }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x019a A[PHI: r4
      0x019a: PHI (r4v28 int) = (r4v0 int), (r4v35 int), (r4v35 int) binds: [B:236:0x019a, B:51:0x0198, B:77:0x01d3] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x019e A[Catch: all -> 0x04fc, Exception -> 0x0500, TRY_LEAVE, TryCatch #24 {Exception -> 0x0500, all -> 0x04fc, blocks: (B:3:0x000f, B:5:0x0015, B:8:0x001a, B:10:0x001e, B:11:0x002c, B:12:0x0042, B:15:0x005b, B:17:0x0062, B:19:0x006c, B:20:0x00ba, B:24:0x00d0, B:27:0x00df, B:29:0x00e8, B:30:0x00fd, B:31:0x0107, B:32:0x0110, B:33:0x0113, B:35:0x011a, B:41:0x0131, B:46:0x0163, B:53:0x019e, B:69:0x01c3, B:70:0x01c6, B:73:0x01ca, B:75:0x01ce, B:78:0x01d4, B:64:0x01bb, B:47:0x0178, B:48:0x018c, B:50:0x0192, B:80:0x01e2, B:42:0x0145, B:38:0x012b, B:43:0x014d, B:23:0x00bf, B:18:0x0069), top: B:265:0x000f }] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01d4 A[Catch: all -> 0x04fc, Exception -> 0x0500, TryCatch #24 {Exception -> 0x0500, all -> 0x04fc, blocks: (B:3:0x000f, B:5:0x0015, B:8:0x001a, B:10:0x001e, B:11:0x002c, B:12:0x0042, B:15:0x005b, B:17:0x0062, B:19:0x006c, B:20:0x00ba, B:24:0x00d0, B:27:0x00df, B:29:0x00e8, B:30:0x00fd, B:31:0x0107, B:32:0x0110, B:33:0x0113, B:35:0x011a, B:41:0x0131, B:46:0x0163, B:53:0x019e, B:69:0x01c3, B:70:0x01c6, B:73:0x01ca, B:75:0x01ce, B:78:0x01d4, B:64:0x01bb, B:47:0x0178, B:48:0x018c, B:50:0x0192, B:80:0x01e2, B:42:0x0145, B:38:0x012b, B:43:0x014d, B:23:0x00bf, B:18:0x0069), top: B:265:0x000f }] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0224 A[Catch: Exception -> 0x04fa, all -> 0x053a, TryCatch #15 {Exception -> 0x04fa, blocks: (B:86:0x021a, B:90:0x0226, B:92:0x0237, B:94:0x026b, B:96:0x0284, B:108:0x02ab, B:109:0x02af, B:111:0x02c8, B:112:0x02d5, B:114:0x032a, B:118:0x0331, B:120:0x033a, B:122:0x033d, B:128:0x035c, B:129:0x0361, B:131:0x0368, B:132:0x036d, B:133:0x0374, B:138:0x0389, B:140:0x03a8, B:142:0x03af, B:144:0x03b6, B:146:0x03bd, B:148:0x03c4, B:150:0x03cb, B:152:0x03d2, B:154:0x03d9, B:156:0x03e0, B:158:0x03e9, B:160:0x03ef, B:162:0x03f7, B:165:0x03fd, B:168:0x0401, B:170:0x0406, B:172:0x040c, B:174:0x0413, B:176:0x0424, B:178:0x0437, B:179:0x0446, B:187:0x0460, B:188:0x046a, B:190:0x048c, B:198:0x049a, B:197:0x0497, B:200:0x049c, B:202:0x04ab, B:186:0x0452, B:104:0x0292, B:103:0x028f, B:107:0x02a2, B:106:0x0294, B:89:0x0224, B:82:0x01ec, B:84:0x01fe), top: B:260:0x01ec }] */
    /* JADX WARN: Type inference failed for: r2v11, types: [sgt, shi] */
    /* JADX WARN: Type inference failed for: r2v14, types: [sgt, shi] */
    /* JADX WARN: Type inference failed for: r2v16, types: [sgt, shi] */
    /* JADX WARN: Type inference failed for: r5v6, types: [sgt, shi] */
    /* JADX WARN: Type inference failed for: r8v4, types: [sgt, shi] */
    @Override // defpackage.llo
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void d(android.content.Context r28) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 1369
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ijg.d(android.content.Context):void");
    }
}
