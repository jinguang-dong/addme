package defpackage;

import java.text.BreakIterator;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.PriorityQueue;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cgo implements cda {
    public final cdo a;
    public final cgp b;
    public final CharSequence c;
    public final cdv d;
    public final int e;
    public tdy f;
    public final qqq g;
    private final String h;
    private final List i;
    private final List j;
    private final chq k;
    private final boolean l;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0290  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x029b A[PHI: r10
      0x029b: PHI (r10v6 boolean) = (r10v5 boolean), (r10v5 boolean), (r10v31 boolean) binds: [B:121:0x0291, B:122:0x0293, B:125:0x029a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:128:0x029e  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x02a5  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x02a8  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x02ac  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x02af  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x02c5  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x02f4  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x032e  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0341  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0351  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0364  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0385  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x039b  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x03e8  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x03f1  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x0498  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x04c5  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x04cf  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x04fe  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x0535  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x05d7  */
    /* JADX WARN: Removed duplicated region for block: B:299:0x06cc  */
    /* JADX WARN: Removed duplicated region for block: B:304:0x06e3  */
    /* JADX WARN: Removed duplicated region for block: B:325:0x074a  */
    /* JADX WARN: Removed duplicated region for block: B:329:0x075a  */
    /* JADX WARN: Removed duplicated region for block: B:337:0x0788  */
    /* JADX WARN: Removed duplicated region for block: B:353:0x07c4  */
    /* JADX WARN: Removed duplicated region for block: B:357:0x07e8  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0050  */
    /* JADX WARN: Type inference failed for: r22v1 */
    /* JADX WARN: Type inference failed for: r22v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r22v3 */
    /* JADX WARN: Type inference failed for: r23v1 */
    /* JADX WARN: Type inference failed for: r23v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r23v3 */
    /* JADX WARN: Type inference failed for: r37v3, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r37v5 */
    /* JADX WARN: Type inference failed for: r37v6 */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r8v18 */
    /* JADX WARN: Type inference failed for: r8v19, types: [android.text.Spannable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v39 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public cgo(java.lang.String r36, defpackage.cdo r37, java.util.List r38, java.util.List r39, defpackage.qqq r40, defpackage.chq r41) {
        /*
            Method dump skipped, instructions count: 2047
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cgo.<init>(java.lang.String, cdo, java.util.List, java.util.List, qqq, chq):void");
    }

    @Override // defpackage.cda
    public final float a() {
        return this.d.b();
    }

    @Override // defpackage.cda
    public final float b() {
        float f;
        cdv cdvVar = this.d;
        if (!Float.isNaN(cdvVar.c)) {
            return cdvVar.c;
        }
        BreakIterator lineInstance = BreakIterator.getLineInstance(cdvVar.b.getTextLocale());
        CharSequence charSequence = cdvVar.a;
        lineInstance.setText(new cdr(charSequence, charSequence.length()));
        PriorityQueue priorityQueue = new PriorityQueue(10, new ccn(2));
        int i = 0;
        for (int next = lineInstance.next(); next != -1; next = lineInstance.next()) {
            if (priorityQueue.size() < 10) {
                priorityQueue.add(new uev(Integer.valueOf(i), Integer.valueOf(next)));
            } else {
                uev uevVar = (uev) priorityQueue.peek();
                if (uevVar != null && ((Number) uevVar.b).intValue() - ((Number) uevVar.a).intValue() < next - i) {
                    priorityQueue.poll();
                    priorityQueue.add(new uev(Integer.valueOf(i), Integer.valueOf(next)));
                }
            }
            i = next;
        }
        if (priorityQueue.isEmpty()) {
            f = 0.0f;
        } else {
            Iterator it = priorityQueue.iterator();
            if (!it.hasNext()) {
                throw new NoSuchElementException();
            }
            uev uevVar2 = (uev) it.next();
            float fA = cdvVar.a(((Number) uevVar2.a).intValue(), ((Number) uevVar2.b).intValue());
            while (it.hasNext()) {
                uev uevVar3 = (uev) it.next();
                fA = Math.max(fA, cdvVar.a(((Number) uevVar3.a).intValue(), ((Number) uevVar3.b).intValue()));
            }
            f = fA;
        }
        cdvVar.c = f;
        return f;
    }

    @Override // defpackage.cda
    public final boolean c() {
        tdy tdyVar = this.f;
        if (tdyVar != null && tdyVar.n()) {
            return true;
        }
        if (!clc.W(this.a)) {
            return false;
        }
        int i = cgs.a;
        ctq ctqVar = ctq.a;
        ((Boolean) a.af()).booleanValue();
        return false;
    }
}
