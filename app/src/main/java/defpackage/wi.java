package defpackage;

import android.os.Trace;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class wi {
    private final sr d;
    private final int b = wj.a.b();
    private final uly c = new uly(false, umc.a);
    public final List a = new ArrayList();
    private final rnu e = new rnu(this);

    public wi(sr srVar) {
        this.d = srVar;
    }

    public final void a() {
        List<sq> listBN;
        List list = this.a;
        synchronized (list) {
            listBN = ske.bN(list);
            list.clear();
        }
        for (sq sqVar : listBN) {
            Trace.beginSection("InvokeInternalListeners");
            List list2 = sqVar.c;
            int size = list2.size();
            for (int i = 0; i < size; i++) {
                sy syVar = (sy) list2.get(i);
                List list3 = sqVar.d;
                int size2 = list3.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    ((ra) list3.get(i2)).a(syVar.a());
                }
            }
            Trace.endSection();
            Trace.beginSection("InvokeRequestListeners");
            int size3 = list2.size();
            for (int i3 = 0; i3 < size3; i3++) {
                sy syVar2 = (sy) list2.get(i3);
                int size4 = syVar2.a().c.size();
                for (int i4 = 0; i4 < size4; i4++) {
                    ((ra) syVar2.a().c.get(i4)).a(syVar2.a());
                }
            }
            Trace.endSection();
        }
        sr srVar = this.d;
        synchronized (srVar.e) {
            Objects.toString(srVar);
            srVar.a.h();
        }
    }

    public final void b() {
        sr srVar = this.d;
        synchronized (srVar.e) {
            Objects.toString(srVar);
            srVar.a.j();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:110:0x023f, code lost:
    
        r7 = r16;
        r1 = r24.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x0249, code lost:
    
        if (r1.hasNext() == false) goto L552;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x024b, code lost:
    
        r2 = (defpackage.rb) r1.next();
        java.util.Objects.toString(r2);
        r3 = r2.d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x0256, code lost:
    
        if (r3 == null) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x0258, code lost:
    
        r3 = r3.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x025b, code lost:
    
        r3 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x025c, code lost:
    
        r4 = r2.e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x025e, code lost:
    
        if (r4 == null) goto L127;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x0260, code lost:
    
        r5 = r4.b;
        r6 = defpackage.ukb.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x0276, code lost:
    
        if (defpackage.a.ao(new defpackage.uji(android.hardware.camera2.TotalCaptureResult.class), new defpackage.uji(android.hardware.camera2.TotalCaptureResult.class)) == false) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x0278, code lost:
    
        r6 = ((defpackage.phm) r5).a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x027e, code lost:
    
        r6 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x0280, code lost:
    
        if (r6 == null) goto L553;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x0282, code lost:
    
        r5 = r14.b().b(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x0298, code lost:
    
        throw new java.lang.IllegalStateException(defpackage.a.bz(r5, "Failed to unwrap FrameInfo ", " as TotalCaptureResult"));
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x0299, code lost:
    
        r5 = r14.b().a(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x02a1, code lost:
    
        if (r5 != null) goto L133;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x02a3, code lost:
    
        if (r4 == null) goto L131;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x02a5, code lost:
    
        java.util.Objects.toString(r4.b);
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x02ab, code lost:
    
        java.util.Objects.toString(defpackage.rd.a(r3));
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x02b2, code lost:
    
        r5 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x02b4, code lost:
    
        if (r5 != null) goto L135;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x02b7, code lost:
    
        r3 = defpackage.tb.a;
        r3 = r0.get(defpackage.tb.b);
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x02bf, code lost:
    
        if (r3 != null) goto L138;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x02c1, code lost:
    
        r3 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x02c3, code lost:
    
        r5.setTag(r3);
        r3 = r2.a;
        r6 = r3.size();
        r13 = 0;
        r15 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x02ce, code lost:
    
        if (r13 >= r6) goto L556;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x02d0, code lost:
    
        r21 = r1;
        r1 = (android.view.Surface) r7.get(r3.get(r13));
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x02dc, code lost:
    
        if (r1 == null) goto L558;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x02de, code lost:
    
        r5.addTarget(r1);
        r15 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x02e2, code lost:
    
        r13 = r13 + 1;
        r1 = r21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x02e7, code lost:
    
        r21 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x02e9, code lost:
    
        if (r15 == false) goto L547;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x02eb, code lost:
    
        if (r4 == null) goto L174;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x02ed, code lost:
    
        r1 = r10.h;
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x02ef, code lost:
    
        if (r1 == null) goto L548;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x02f1, code lost:
    
        r4 = r4.a;
        r6 = r10.e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x02f5, code lost:
    
        monitor-enter(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x02f8, code lost:
    
        if (r10.f == false) goto L156;
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x02fa, code lost:
    
        android.util.Log.w("CXCP", r10 + " disconnected. " + r4 + " can't be queued to " + r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x031b, code lost:
    
        monitor-exit(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x031e, code lost:
    
        monitor-exit(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x031f, code lost:
    
        java.util.Objects.toString(r4);
        java.util.Objects.toString(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x0325, code lost:
    
        r13 = defpackage.ukb.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x0339, code lost:
    
        if (defpackage.a.ao(new defpackage.uji(android.media.Image.class), new defpackage.uji(android.media.Image.class)) == false) goto L161;
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x033b, code lost:
    
        r6 = ((defpackage.xj) r4).a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x0341, code lost:
    
        r6 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x0343, code lost:
    
        if (r6 != null) goto L164;
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x0345, code lost:
    
        android.util.Log.w("CXCP", "Failed to unwrap image wrapper " + r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x035c, code lost:
    
        r1.a.queueInputImage(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x0361, code lost:
    
        defpackage.byi.bA(r5, r2.b);
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x036b, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x036c, code lost:
    
        android.util.Log.w("CXCP", "Failed to queue image to " + r1 + " due to error " + r0.getMessage() + ". Ignoring failure and closing " + r4);
        r4.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:172:0x03a6, code lost:
    
        r1 = r10.a;
        java.util.Objects.toString(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:173:0x03ba, code lost:
    
        throw new java.lang.IllegalStateException("Failed to create ImageWriter for capture session: ".concat(r1.toString()));
     */
    /* JADX WARN: Code restructure failed: missing block: B:174:0x03bb, code lost:
    
        defpackage.byi.bA(r5, r25);
        defpackage.byi.bA(r5, r26);
        defpackage.byi.bA(r5, r2.b);
        defpackage.byi.bA(r5, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:175:0x03cd, code lost:
    
        defpackage.ss.c.c();
        r15 = r5.build();
        r15.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:176:0x03db, code lost:
    
        if ((r14 instanceof defpackage.rl) == false) goto L211;
     */
    /* JADX WARN: Code restructure failed: missing block: B:177:0x03dd, code lost:
    
        r5 = ((defpackage.rl) r14).k(r15);
     */
    /* JADX WARN: Code restructure failed: missing block: B:178:0x03e4, code lost:
    
        if (r5 != null) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:181:0x03ec, code lost:
    
        if (r3.isEmpty() == false) goto L183;
     */
    /* JADX WARN: Code restructure failed: missing block: B:182:0x03ee, code lost:
    
        r16 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:183:0x03f8, code lost:
    
        r3 = r3.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:185:0x0400, code lost:
    
        if (r3.hasNext() == false) goto L559;
     */
    /* JADX WARN: Code restructure failed: missing block: B:186:0x0402, code lost:
    
        r6 = ((defpackage.rh) r3.next()).a;
        r6 = ((defpackage.wq) r10.c).k;
     */
    /* JADX WARN: Code restructure failed: missing block: B:187:0x0412, code lost:
    
        if ((r6 instanceof java.util.Collection) == false) goto L560;
     */
    /* JADX WARN: Code restructure failed: missing block: B:189:0x0418, code lost:
    
        if (r6.isEmpty() != false) goto L565;
     */
    /* JADX WARN: Code restructure failed: missing block: B:190:0x041a, code lost:
    
        r6 = r6.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:192:0x0422, code lost:
    
        if (r6.hasNext() == false) goto L567;
     */
    /* JADX WARN: Code restructure failed: missing block: B:193:0x0424, code lost:
    
        r13 = (defpackage.wo) r6.next();
        r15 = r13.h;
     */
    /* JADX WARN: Code restructure failed: missing block: B:194:0x042c, code lost:
    
        if (r15 != null) goto L196;
     */
    /* JADX WARN: Code restructure failed: missing block: B:195:0x042e, code lost:
    
        r18 = r2;
        r15 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:196:0x0434, code lost:
    
        r0 = r15.a;
        r18 = r2;
        r15 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:197:0x043f, code lost:
    
        if (defpackage.a.q(r0, 3) != false) goto L562;
     */
    /* JADX WARN: Code restructure failed: missing block: B:199:0x0443, code lost:
    
        if (r13.j == null) goto L568;
     */
    /* JADX WARN: Code restructure failed: missing block: B:201:0x044b, code lost:
    
        if (defpackage.a.q(1, 1) == false) goto L569;
     */
    /* JADX WARN: Code restructure failed: missing block: B:203:0x044e, code lost:
    
        r3 = r15;
        r2 = r18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:205:0x0458, code lost:
    
        r6 = r5.size();
        r13 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:206:0x045d, code lost:
    
        if (r13 >= r6) goto L570;
     */
    /* JADX WARN: Code restructure failed: missing block: B:207:0x045f, code lost:
    
        r16 = r7;
        r7 = r13;
        r15 = new defpackage.sy(r14, (android.hardware.camera2.CaptureRequest) r5.get(r13), r16, r23, r18);
        r8.add(r5.get(r7));
        r9.add(r15);
        r13 = r7 + 1;
        r7 = r16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:208:0x0483, code lost:
    
        r0 = r27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:210:0x048c, code lost:
    
        r13 = new defpackage.sy(r14, (android.hardware.camera2.CaptureRequest) r5.get(0), r16, r23, r2);
        r8.add(r5.get(0));
        r9.add(r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:211:0x04a6, code lost:
    
        r16 = r7;
        r13 = new defpackage.sy(r14, r15, r16, r23, r2);
        r8.add(r15);
        r9.add(r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:212:0x04bb, code lost:
    
        r0 = r27;
        r7 = r16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:213:0x04bf, code lost:
    
        r1 = r21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:215:0x04ca, code lost:
    
        throw new java.lang.IllegalStateException("Check failed.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:216:0x04cb, code lost:
    
        r1 = true;
        r5 = new defpackage.sq(((defpackage.rm) r10.a.b()).a, r23, r8, r9, r28, r11, r12);
     */
    /* JADX WARN: Removed duplicated region for block: B:219:0x04e4  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x0545  */
    /* JADX WARN: Removed duplicated region for block: B:450:0x098d A[Catch: all -> 0x099d, TRY_ENTER, TryCatch #14 {all -> 0x099d, blocks: (B:7:0x0027, B:9:0x0055, B:11:0x005d, B:12:0x0064, B:14:0x006a, B:43:0x00e5, B:45:0x00ed, B:47:0x00f3, B:48:0x0100, B:73:0x0169, B:75:0x016f, B:77:0x0175, B:78:0x0184, B:80:0x018e, B:83:0x0195, B:84:0x0199, B:86:0x019f, B:88:0x01ab, B:51:0x010a, B:52:0x010e, B:54:0x0114, B:56:0x0126, B:58:0x012c, B:59:0x0130, B:61:0x0136, B:67:0x0155, B:69:0x0159, B:64:0x0145, B:17:0x007d, B:18:0x0081, B:20:0x0087, B:22:0x009b, B:24:0x00a1, B:25:0x00a5, B:27:0x00ab, B:33:0x00c7, B:36:0x00cc, B:30:0x00ba, B:90:0x01d0, B:92:0x01d7, B:93:0x01db, B:95:0x01e1, B:96:0x01ee, B:98:0x01f4, B:101:0x020d, B:103:0x021c, B:107:0x0234, B:110:0x023f, B:111:0x0245, B:113:0x024b, B:115:0x0258, B:117:0x025c, B:119:0x0260, B:121:0x0278, B:124:0x0282, B:130:0x02a5, B:131:0x02ab, B:135:0x02b7, B:138:0x02c3, B:140:0x02d0, B:142:0x02de, B:143:0x02e2, B:147:0x02ed, B:149:0x02f1, B:150:0x02f5, B:154:0x031b, B:156:0x031e, B:157:0x031f, B:168:0x0399, B:165:0x0361, B:175:0x03cd, B:177:0x03dd, B:180:0x03e8, B:210:0x048c, B:183:0x03f8, B:184:0x03fc, B:186:0x0402, B:188:0x0414, B:190:0x041a, B:191:0x041e, B:193:0x0424, B:198:0x0441, B:200:0x0445, B:205:0x0458, B:207:0x045f, B:196:0x0434, B:211:0x04a6, B:167:0x036c, B:170:0x03a4, B:171:0x03a5, B:172:0x03a6, B:173:0x03ba, B:174:0x03bb, B:214:0x04c3, B:215:0x04ca, B:125:0x028b, B:126:0x0298, B:127:0x0299, B:216:0x04cb, B:450:0x098d, B:451:0x0994, B:452:0x0995, B:453:0x099c, B:151:0x02f6, B:153:0x02fa, B:158:0x0325, B:160:0x033b, B:163:0x0345, B:164:0x035c), top: B:475:0x0027, inners: #0, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0106 A[PHI: r3
      0x0106: PHI (r3v67 sr) = (r3v54 sr), (r3v55 sr) binds: [B:49:0x0104, B:517:0x0106] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x010a A[Catch: all -> 0x099d, TryCatch #14 {all -> 0x099d, blocks: (B:7:0x0027, B:9:0x0055, B:11:0x005d, B:12:0x0064, B:14:0x006a, B:43:0x00e5, B:45:0x00ed, B:47:0x00f3, B:48:0x0100, B:73:0x0169, B:75:0x016f, B:77:0x0175, B:78:0x0184, B:80:0x018e, B:83:0x0195, B:84:0x0199, B:86:0x019f, B:88:0x01ab, B:51:0x010a, B:52:0x010e, B:54:0x0114, B:56:0x0126, B:58:0x012c, B:59:0x0130, B:61:0x0136, B:67:0x0155, B:69:0x0159, B:64:0x0145, B:17:0x007d, B:18:0x0081, B:20:0x0087, B:22:0x009b, B:24:0x00a1, B:25:0x00a5, B:27:0x00ab, B:33:0x00c7, B:36:0x00cc, B:30:0x00ba, B:90:0x01d0, B:92:0x01d7, B:93:0x01db, B:95:0x01e1, B:96:0x01ee, B:98:0x01f4, B:101:0x020d, B:103:0x021c, B:107:0x0234, B:110:0x023f, B:111:0x0245, B:113:0x024b, B:115:0x0258, B:117:0x025c, B:119:0x0260, B:121:0x0278, B:124:0x0282, B:130:0x02a5, B:131:0x02ab, B:135:0x02b7, B:138:0x02c3, B:140:0x02d0, B:142:0x02de, B:143:0x02e2, B:147:0x02ed, B:149:0x02f1, B:150:0x02f5, B:154:0x031b, B:156:0x031e, B:157:0x031f, B:168:0x0399, B:165:0x0361, B:175:0x03cd, B:177:0x03dd, B:180:0x03e8, B:210:0x048c, B:183:0x03f8, B:184:0x03fc, B:186:0x0402, B:188:0x0414, B:190:0x041a, B:191:0x041e, B:193:0x0424, B:198:0x0441, B:200:0x0445, B:205:0x0458, B:207:0x045f, B:196:0x0434, B:211:0x04a6, B:167:0x036c, B:170:0x03a4, B:171:0x03a5, B:172:0x03a6, B:173:0x03ba, B:174:0x03bb, B:214:0x04c3, B:215:0x04ca, B:125:0x028b, B:126:0x0298, B:127:0x0299, B:216:0x04cb, B:450:0x098d, B:451:0x0994, B:452:0x0995, B:453:0x099c, B:151:0x02f6, B:153:0x02fa, B:158:0x0325, B:160:0x033b, B:163:0x0345, B:164:0x035c), top: B:475:0x0027, inners: #0, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0195 A[Catch: all -> 0x099d, TryCatch #14 {all -> 0x099d, blocks: (B:7:0x0027, B:9:0x0055, B:11:0x005d, B:12:0x0064, B:14:0x006a, B:43:0x00e5, B:45:0x00ed, B:47:0x00f3, B:48:0x0100, B:73:0x0169, B:75:0x016f, B:77:0x0175, B:78:0x0184, B:80:0x018e, B:83:0x0195, B:84:0x0199, B:86:0x019f, B:88:0x01ab, B:51:0x010a, B:52:0x010e, B:54:0x0114, B:56:0x0126, B:58:0x012c, B:59:0x0130, B:61:0x0136, B:67:0x0155, B:69:0x0159, B:64:0x0145, B:17:0x007d, B:18:0x0081, B:20:0x0087, B:22:0x009b, B:24:0x00a1, B:25:0x00a5, B:27:0x00ab, B:33:0x00c7, B:36:0x00cc, B:30:0x00ba, B:90:0x01d0, B:92:0x01d7, B:93:0x01db, B:95:0x01e1, B:96:0x01ee, B:98:0x01f4, B:101:0x020d, B:103:0x021c, B:107:0x0234, B:110:0x023f, B:111:0x0245, B:113:0x024b, B:115:0x0258, B:117:0x025c, B:119:0x0260, B:121:0x0278, B:124:0x0282, B:130:0x02a5, B:131:0x02ab, B:135:0x02b7, B:138:0x02c3, B:140:0x02d0, B:142:0x02de, B:143:0x02e2, B:147:0x02ed, B:149:0x02f1, B:150:0x02f5, B:154:0x031b, B:156:0x031e, B:157:0x031f, B:168:0x0399, B:165:0x0361, B:175:0x03cd, B:177:0x03dd, B:180:0x03e8, B:210:0x048c, B:183:0x03f8, B:184:0x03fc, B:186:0x0402, B:188:0x0414, B:190:0x041a, B:191:0x041e, B:193:0x0424, B:198:0x0441, B:200:0x0445, B:205:0x0458, B:207:0x045f, B:196:0x0434, B:211:0x04a6, B:167:0x036c, B:170:0x03a4, B:171:0x03a5, B:172:0x03a6, B:173:0x03ba, B:174:0x03bb, B:214:0x04c3, B:215:0x04ca, B:125:0x028b, B:126:0x0298, B:127:0x0299, B:216:0x04cb, B:450:0x098d, B:451:0x0994, B:452:0x0995, B:453:0x099c, B:151:0x02f6, B:153:0x02fa, B:158:0x0325, B:160:0x033b, B:163:0x0345, B:164:0x035c), top: B:475:0x0027, inners: #0, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x019f A[Catch: all -> 0x099d, TryCatch #14 {all -> 0x099d, blocks: (B:7:0x0027, B:9:0x0055, B:11:0x005d, B:12:0x0064, B:14:0x006a, B:43:0x00e5, B:45:0x00ed, B:47:0x00f3, B:48:0x0100, B:73:0x0169, B:75:0x016f, B:77:0x0175, B:78:0x0184, B:80:0x018e, B:83:0x0195, B:84:0x0199, B:86:0x019f, B:88:0x01ab, B:51:0x010a, B:52:0x010e, B:54:0x0114, B:56:0x0126, B:58:0x012c, B:59:0x0130, B:61:0x0136, B:67:0x0155, B:69:0x0159, B:64:0x0145, B:17:0x007d, B:18:0x0081, B:20:0x0087, B:22:0x009b, B:24:0x00a1, B:25:0x00a5, B:27:0x00ab, B:33:0x00c7, B:36:0x00cc, B:30:0x00ba, B:90:0x01d0, B:92:0x01d7, B:93:0x01db, B:95:0x01e1, B:96:0x01ee, B:98:0x01f4, B:101:0x020d, B:103:0x021c, B:107:0x0234, B:110:0x023f, B:111:0x0245, B:113:0x024b, B:115:0x0258, B:117:0x025c, B:119:0x0260, B:121:0x0278, B:124:0x0282, B:130:0x02a5, B:131:0x02ab, B:135:0x02b7, B:138:0x02c3, B:140:0x02d0, B:142:0x02de, B:143:0x02e2, B:147:0x02ed, B:149:0x02f1, B:150:0x02f5, B:154:0x031b, B:156:0x031e, B:157:0x031f, B:168:0x0399, B:165:0x0361, B:175:0x03cd, B:177:0x03dd, B:180:0x03e8, B:210:0x048c, B:183:0x03f8, B:184:0x03fc, B:186:0x0402, B:188:0x0414, B:190:0x041a, B:191:0x041e, B:193:0x0424, B:198:0x0441, B:200:0x0445, B:205:0x0458, B:207:0x045f, B:196:0x0434, B:211:0x04a6, B:167:0x036c, B:170:0x03a4, B:171:0x03a5, B:172:0x03a6, B:173:0x03ba, B:174:0x03bb, B:214:0x04c3, B:215:0x04ca, B:125:0x028b, B:126:0x0298, B:127:0x0299, B:216:0x04cb, B:450:0x098d, B:451:0x0994, B:452:0x0995, B:453:0x099c, B:151:0x02f6, B:153:0x02fa, B:158:0x0325, B:160:0x033b, B:163:0x0345, B:164:0x035c), top: B:475:0x0027, inners: #0, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01d7 A[Catch: all -> 0x099d, TryCatch #14 {all -> 0x099d, blocks: (B:7:0x0027, B:9:0x0055, B:11:0x005d, B:12:0x0064, B:14:0x006a, B:43:0x00e5, B:45:0x00ed, B:47:0x00f3, B:48:0x0100, B:73:0x0169, B:75:0x016f, B:77:0x0175, B:78:0x0184, B:80:0x018e, B:83:0x0195, B:84:0x0199, B:86:0x019f, B:88:0x01ab, B:51:0x010a, B:52:0x010e, B:54:0x0114, B:56:0x0126, B:58:0x012c, B:59:0x0130, B:61:0x0136, B:67:0x0155, B:69:0x0159, B:64:0x0145, B:17:0x007d, B:18:0x0081, B:20:0x0087, B:22:0x009b, B:24:0x00a1, B:25:0x00a5, B:27:0x00ab, B:33:0x00c7, B:36:0x00cc, B:30:0x00ba, B:90:0x01d0, B:92:0x01d7, B:93:0x01db, B:95:0x01e1, B:96:0x01ee, B:98:0x01f4, B:101:0x020d, B:103:0x021c, B:107:0x0234, B:110:0x023f, B:111:0x0245, B:113:0x024b, B:115:0x0258, B:117:0x025c, B:119:0x0260, B:121:0x0278, B:124:0x0282, B:130:0x02a5, B:131:0x02ab, B:135:0x02b7, B:138:0x02c3, B:140:0x02d0, B:142:0x02de, B:143:0x02e2, B:147:0x02ed, B:149:0x02f1, B:150:0x02f5, B:154:0x031b, B:156:0x031e, B:157:0x031f, B:168:0x0399, B:165:0x0361, B:175:0x03cd, B:177:0x03dd, B:180:0x03e8, B:210:0x048c, B:183:0x03f8, B:184:0x03fc, B:186:0x0402, B:188:0x0414, B:190:0x041a, B:191:0x041e, B:193:0x0424, B:198:0x0441, B:200:0x0445, B:205:0x0458, B:207:0x045f, B:196:0x0434, B:211:0x04a6, B:167:0x036c, B:170:0x03a4, B:171:0x03a5, B:172:0x03a6, B:173:0x03ba, B:174:0x03bb, B:214:0x04c3, B:215:0x04ca, B:125:0x028b, B:126:0x0298, B:127:0x0299, B:216:0x04cb, B:450:0x098d, B:451:0x0994, B:452:0x0995, B:453:0x099c, B:151:0x02f6, B:153:0x02fa, B:158:0x0325, B:160:0x033b, B:163:0x0345, B:164:0x035c), top: B:475:0x0027, inners: #0, #4 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean c(boolean r23, java.util.List r24, java.util.Map r25, java.util.Map r26, java.util.Map r27, java.util.List r28) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 2466
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wi.c(boolean, java.util.List, java.util.Map, java.util.Map, java.util.Map, java.util.List):boolean");
    }

    public final Object d() {
        toString();
        if (this.c.b()) {
            this.d.a();
            ufg ufgVar = ufg.a;
            if (ufgVar == uhi.a) {
                return ufgVar;
            }
        }
        return ufg.a;
    }

    public final String toString() {
        return "GraphRequestProcessor-" + this.b;
    }
}
