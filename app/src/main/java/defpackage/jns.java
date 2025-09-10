package defpackage;

import android.media.MediaExtractor;
import com.google.android.apps.camera.imax.cyclops.audio.xcIh.cdVQ;
import j$.nio.channels.DesugarChannels;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes.dex */
public class jns {
    private static final sgv a = sgv.g("jns");
    private final jof b;

    public jns(jof jofVar) {
        this.b = jofVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [sgt, shi] */
    public final void a(pos posVar) throws IOException {
        rwc rwcVarJ;
        sbp sbpVarN;
        if (this.b != jof.FRAMEWORK) {
            return;
        }
        try {
            MediaExtractor mediaExtractor = new MediaExtractor();
            try {
                FileInputStream fileInputStreamE = jsv.e(posVar);
                try {
                    mediaExtractor.setDataSource(fileInputStreamE.getFD());
                    int trackCount = mediaExtractor.getTrackCount();
                    int iA = 0;
                    int i = 0;
                    int i2 = 0;
                    while (true) {
                        if (i >= trackCount) {
                            rwcVarJ = rvk.a;
                            break;
                        }
                        String string = mediaExtractor.getTrackFormat(i).getString("mime");
                        if (qsp.v(string) && (i2 = i2 + 1) == 2) {
                            rwcVarJ = rwc.j(Integer.valueOf(i + 1));
                            break;
                        }
                        i++;
                        if (string.equals("application/motionphoto-highres")) {
                            rwcVarJ = rwc.j(Integer.valueOf(i));
                            break;
                        }
                    }
                    fileInputStreamE.close();
                    mediaExtractor.release();
                    if (!rwcVarJ.h()) {
                        return;
                    }
                    rwcVarJ.c();
                    long jA = posVar.a();
                    int iIntValue = ((Integer) rwcVarJ.c()).intValue();
                    FileInputStream fileInputStreamE2 = jsv.e(posVar);
                    try {
                        qay qayVar = new qay(DesugarChannels.convertMaybeLegacyFileChannelFromLibrary(fileInputStreamE2.getChannel()).map(FileChannel.MapMode.READ_ONLY, 0L, jA), Arrays.asList("moov", "trak", "stbl", "mdia"));
                        Object obj = qayVar.a;
                        qex qexVar = new qex(((ByteBuffer) obj).position(), ((ByteBuffer) obj).limit());
                        qay qayVar2 = new qay(rvk.a);
                        try {
                            qayVar.g(qayVar2, qayVar.d(qexVar));
                            List<qay> listF = qayVar2.h("moov").f("trak");
                            if (listF.size() < 2 || listF.size() > 10) {
                                throw new qey(String.format(Locale.US, "This file has %d trak boxes", Integer.valueOf(listF.size())));
                            }
                            int iA2 = qayVar2.h("moov").h("mvhd").e(qed.c).a();
                            if (iA2 == 0) {
                                throw new qey("Video time scale is 0.");
                            }
                            qew qewVar = null;
                            qew qewVarE = null;
                            int iMax = 0;
                            for (qay qayVar3 : listF) {
                                qay qayVarH = qayVar3.h("tkhd");
                                int iA3 = qayVarH.e(qed.a).a();
                                qew qewVarE2 = qayVarH.e(qed.b);
                                qay qayVarH2 = qayVar3.h("mdia").h("mdhd");
                                if (iA3 != iIntValue) {
                                    iMax = Math.max(iMax, qewVarE2.a());
                                } else {
                                    qewVarE = qayVarH2.e(qed.f);
                                    iA = qayVarH2.e(qed.e).a();
                                    if (iA == 0) {
                                        throw new qey(cdVQ.PSJPyAgqqtKFhi);
                                    }
                                    qewVar = qewVarE2;
                                }
                            }
                            if (qewVar == null || iA == 0 || qewVarE == null) {
                                throw new qey(a.bE(iIntValue, "Track ", " not found."));
                            }
                            qew qewVarE3 = qayVar2.h("moov").h("mvhd").e(qed.d);
                            if (qewVarE3.a() <= iMax) {
                                String.format("Not fixing video since entire video length %d is shorter than the high-res track %d (video units)", Integer.valueOf(qewVarE3.a()), Integer.valueOf(iMax));
                                int i3 = sbp.d;
                                sbpVarN = sex.a;
                            } else {
                                long jA2 = qed.a(iA2, qewVarE3.a());
                                long jA3 = qed.a(iA2, qewVar.a());
                                long jA4 = qed.a(iA, qewVarE.a());
                                long jA5 = qed.a(iA2, iMax);
                                if (jA2 == 0 || jA3 == 0 || jA4 == 0 || jA5 == 0) {
                                    throw new qey(String.format(Locale.US, "Zero video lengths? %d %d %d %d", Long.valueOf(jA2), Long.valueOf(jA3), Long.valueOf(jA4), Long.valueOf(jA5)));
                                }
                                if (jA2 != jA3) {
                                    throw new qey(String.format(Locale.US, "Video length %d, but longest (high-res) track is %d", Long.valueOf(jA2), Long.valueOf(jA3)));
                                }
                                if (Math.abs(jA3 - jA4) > Math.max(jA3, jA4) / 8) {
                                    throw new qey(String.format(Locale.US, "Track and media lengths of the high-res track substantially different: %d vs %d", Long.valueOf(jA3), Long.valueOf(jA4)));
                                }
                                if (jA5 < jA4 * 0.25d) {
                                    throw new qey(String.format(Locale.US, "Target length too short: %d to %d?", Long.valueOf(jA2), Long.valueOf(jA5)));
                                }
                                long jA6 = qed.a(iA2, qewVarE3.a());
                                long jA7 = qed.a(iA2, iMax);
                                String.format(Locale.US, "Fixing video length from %d us to %d us", Long.valueOf(jA6), Long.valueOf(jA7));
                                sbpVarN = sbp.n(new qec(qewVarE3.a, iMax), new qec(qewVar.a, iMax), new qec(qewVarE.a, (int) ((iA * jA7) / 1000000)));
                            }
                            fileInputStreamE2.close();
                            if (sbpVarN.isEmpty()) {
                                return;
                            }
                            FileOutputStream fileOutputStreamE = posVar.e();
                            try {
                                sgk it = sbpVarN.iterator();
                                while (it.hasNext()) {
                                    qec qecVar = (qec) it.next();
                                    DesugarChannels.convertMaybeLegacyFileChannelFromLibrary(fileOutputStreamE.getChannel()).position(qecVar.a);
                                    ByteBuffer byteBufferAllocate = ByteBuffer.allocate(4);
                                    byteBufferAllocate.putInt(qecVar.b);
                                    byteBufferAllocate.rewind();
                                    DesugarChannels.convertMaybeLegacyFileChannelFromLibrary(fileOutputStreamE.getChannel()).write(byteBufferAllocate);
                                }
                                fileOutputStreamE.close();
                            } finally {
                            }
                        } catch (Exception e) {
                            throw new qey(e);
                        }
                    } finally {
                    }
                } finally {
                }
            } catch (Throwable th) {
                mediaExtractor.release();
                throw th;
            }
        } catch (IOException | qey e2) {
            ((sgt) ((sgt) a.b().i(e2)).M((char) 2914)).s("Couldn't apply MP4 fix");
        }
    }
}
