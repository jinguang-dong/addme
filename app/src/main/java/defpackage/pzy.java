package defpackage;

import j$.nio.channels.DesugarChannels;
import java.io.IOException;
import java.io.OutputStream;
import java.io.RandomAccessFile;
import java.nio.channels.Channels;
import java.nio.channels.FileChannel;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class pzy implements sxi {
    public final /* synthetic */ long a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    private final /* synthetic */ int d;

    public /* synthetic */ pzy(Object obj, long j, Object obj2, int i) {
        this.d = i;
        this.b = obj;
        this.a = j;
        this.c = obj2;
    }

    @Override // defpackage.sxi
    public final syu a(Object obj) {
        int i = this.d;
        if (i == 0) {
            pvr pvrVar = (pvr) obj;
            long j = pvrVar.f;
            long j2 = this.a;
            if (j2 <= j) {
                return ske.M(true);
            }
            tpc tpcVar = (tpc) pvrVar.a(5, null);
            tpcVar.r(pvrVar);
            if (!tpcVar.b.C()) {
                tpcVar.o();
            }
            Object obj2 = this.c;
            Object obj3 = this.b;
            pvr pvrVar2 = (pvr) tpcVar.b;
            pvrVar2.b |= 8;
            pvrVar2.f = j2;
            return ((qag) obj3).c.h((pvp) obj2, (pvr) tpcVar.l());
        }
        if (i != 1) {
            Long l = (Long) obj;
            final long j3 = this.a;
            if (j3 < 0 || j3 > l.longValue()) {
                throw new IllegalArgumentException(rnt.z("Offset for write (%s) out of range of existing file size (%s bytes)", Long.valueOf(j3), l));
            }
            Object obj4 = this.c;
            final rdf rdfVar = (rdf) this.b;
            final nzj nzjVar = (nzj) obj4;
            return rdfVar.d.b(new sxh() { // from class: rdd
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, java.util.concurrent.Executor] */
                @Override // defpackage.sxh
                public final syu a() {
                    final rdf rdfVar2 = rdfVar;
                    qwl qwlVar = new qwl(rdfVar2.b, nzjVar, 4);
                    qas qasVar = rdfVar2.e;
                    qdp qdpVarE = qdp.e(((ren) qasVar.b).b(qwlVar, qasVar.a));
                    final long j4 = j3;
                    return qdpVarE.g(new sxi() { // from class: rde
                        @Override // defpackage.sxi
                        public final syu a(Object obj5) {
                            rdf rdfVar3 = rdfVar2;
                            long j5 = j4;
                            try {
                                rcv rcvVar = new rcv((RandomAccessFile) rdfVar3.f.m(rdfVar3.b, new rdk(0)));
                                try {
                                    FileChannel fileChannelConvertMaybeLegacyFileChannelFromLibrary = DesugarChannels.convertMaybeLegacyFileChannelFromLibrary(((RandomAccessFile) rcvVar.a).getChannel());
                                    fileChannelConvertMaybeLegacyFileChannelFromLibrary.position(j5);
                                    List listA = rdfVar3.a.a(Channels.newOutputStream(fileChannelConvertMaybeLegacyFileChannelFromLibrary));
                                    rcvVar.a = null;
                                    syu syuVarM = ske.M(Channels.newChannel((OutputStream) listA.get(0)));
                                    rcvVar.close();
                                    return syuVarM;
                                } finally {
                                }
                            } catch (IOException e) {
                                return ske.L(e);
                            }
                        }
                    }, rdfVar2.c);
                }
            }, rdfVar.c);
        }
        qao qaoVar = (qao) obj;
        if (qaoVar != null) {
            return ske.M(qaoVar);
        }
        Object obj5 = this.b;
        long j4 = this.a;
        pvl pvlVar = (pvl) this.c;
        qbu.e("%s: importFiles for group name: %s, buildId: %d, variantId: %s, but no group was found", "FileGroupManager", pvlVar.c, Long.valueOf(j4), obj5);
        tfm tfmVarA = pul.a();
        tfmVarA.b = puk.GROUP_NOT_FOUND_ERROR;
        tfmVarA.c = "file group: " + pvlVar.c + " not found! Make sure addFileGroup has been called.";
        return ske.L(tfmVarA.c());
    }

    public /* synthetic */ pzy(pvl pvlVar, long j, String str, int i) {
        this.d = i;
        this.c = pvlVar;
        this.a = j;
        this.b = str;
    }
}
