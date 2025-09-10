package defpackage;

import j$.time.Instant;
import j$.time.ZoneOffset;
import j$.time.ZonedDateTime;
import j$.util.Optional;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes.dex */
public class jlz {
    private static final sgv a = sgv.g("jlz");

    /* JADX WARN: Type inference failed for: r1v3, types: [sgt, shi] */
    /* JADX WARN: Type inference failed for: r7v2, types: [sgt, shi] */
    public static final InputStream a(byte[] bArr, long j, jly jlyVar) throws pqo {
        boolean z;
        edw edwVarM = pqw.m(bArr);
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        jma jmaVar = jlyVar.b;
        if (jmaVar != jma.a) {
            ZonedDateTime zonedDateTimeAtZone = Instant.ofEpochMilli(j).atZone(ZoneOffset.UTC);
            String str = jmaVar.f;
            try {
                int year = zonedDateTimeAtZone.getYear();
                int monthValue = zonedDateTimeAtZone.getMonthValue();
                int dayOfMonth = zonedDateTimeAtZone.getDayOfMonth();
                int hour = zonedDateTimeAtZone.getHour();
                int minute = zonedDateTimeAtZone.getMinute();
                int second = zonedDateTimeAtZone.getSecond();
                int i = edu.a;
                eee eeeVar = new eee();
                eeeVar.g(year);
                eeeVar.e(monthValue);
                eeeVar.b(dayOfMonth);
                eeeVar.c(hour);
                eeeVar.d(minute);
                eeeVar.f(second);
                eeeVar.h = 0;
                edy.a.c("http://iptc.org/std/Iptc4xmpExt/2008-02-29/", "Iptc4xmpExt");
                edwVarM.c("http://iptc.org/std/Iptc4xmpExt/2008-02-29/", "Credit", "Edited with Google AI");
                edwVarM.c("http://iptc.org/std/Iptc4xmpExt/2008-02-29/", "DateCreated", eeeVar);
                edwVarM.c("http://iptc.org/std/Iptc4xmpExt/2008-02-29/", "DigitalSourceType", str);
                z = true;
            } catch (edv e) {
                ((sgt) jmb.a.c().M(2835)).v("Error while appending IPTC metadata: %s", e.getMessage());
            }
        } else {
            z = false;
        }
        atomicBoolean.set(z);
        Optional optional = jlyVar.c;
        if (optional.isPresent()) {
            Optional optional2 = jlyVar.d;
            boolean z2 = jlyVar.e;
            jea.d((UUID) optional.get(), optional2, z2, hqp.NONE.e(), false, edwVarM);
            atomicBoolean.set(true);
        }
        Optional optional3 = jlyVar.f;
        if (optional3.isPresent()) {
            try {
                Object obj = optional3.get();
                try {
                    edy.a.c("http://ns.google.com/photos/1.0/camera/", "GCamera");
                    rwc rwcVarJ = rvk.a;
                    try {
                        if (edwVarM.e("http://ns.google.com/photos/1.0/camera/", "GFileMetadata")) {
                            try {
                                byte[] bArr2 = (byte[]) ((eek) edwVarM).m("http://ns.google.com/photos/1.0/camera/", "GFileMetadata", 7);
                                tph tphVarQ = tph.q(tno.a, bArr2, 0, bArr2.length, tow.a());
                                tph.D(tphVarQ);
                                rwcVarJ = rwc.j((tno) tphVarQ);
                            } catch (edv e2) {
                                throw new pqo("Failed to read GFileMetadata XMP property", e2);
                            } catch (tpz e3) {
                                throw new pqo("Failed to create GFileMetadata from XMP property", e3);
                            }
                        }
                    } catch (pqo e4) {
                        ((sgt) ((sgt) pqp.a.c().i(e4)).M((char) 5652)).s("Unable to read existing GFileMetadata from XMP");
                    }
                    if (rwcVarJ.h()) {
                        Object objC = rwcVarJ.c();
                        tpc tpcVar = (tpc) ((tph) objC).a(5, null);
                        tpcVar.r((tph) objC);
                        tpcVar.r((tph) obj);
                        obj = (tno) tpcVar.l();
                    }
                    try {
                        ((eek) edwVarM).d("http://ns.google.com/photos/1.0/camera/", "GFileMetadata", ((tnr) obj).h(), null);
                        atomicBoolean.set(true);
                    } catch (edv e5) {
                        throw new pqo("Failed to write GFileMetadata to XMP", e5);
                    }
                } catch (edv e6) {
                    throw new pqo("Failed to register Camera Namespace", e6);
                }
            } catch (pqo e7) {
                ((sgt) ((sgt) a.c().i(e7)).M((char) 2833)).s("Failed to write GFileMetadata to XMP");
            }
        }
        gga ggaVar = edy.a;
        eek eekVar = new eek();
        jlyVar.a.ifPresent(new fxu(eekVar, atomicBoolean, 18));
        if (!atomicBoolean.get()) {
            return new ByteArrayInputStream(bArr);
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        pqw.o(bArr, byteArrayOutputStream, edwVarM, eekVar);
        return new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
    }
}
